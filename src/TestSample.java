import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSample {
	//@Parameters("browser")
	@Test(dataProvider="getdata")
	public void TestLogin(String username,String password,String Browser) throws MalformedURLException
	{
		WebDriver wb;
		DesiredCapabilities d  = null;
		if(Browser.equals("firefox"))
		{
		 d =  DesiredCapabilities.firefox();
		d.setBrowserName("firefox");
		d.setPlatform(Platform.ANY);
		RemoteWebDriver rd = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),d);
		rd.get("http://www.gmail.com");
		//d.get("http://www.gmail.com");
		//d.findElement(By.xpath(username));
		//d.findElement(By.xpath(password));
	}
		if(Browser.equals("chrome"))
		{
		 d =  DesiredCapabilities.chrome();
		d.setBrowserName("chrome");
		d.setPlatform(Platform.ANY);
		RemoteWebDriver rd = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),d);
		//d.get("http://www.gmail.com");
		//d.findElement(By.xpath(username));
		//d.findElement(By.xpath(password));
	}
		if(Browser.equals("ie"))
		{
		 d =  DesiredCapabilities.internetExplorer();
		d.setBrowserName("iexplore");
		d.setPlatform(Platform.ANY);
		RemoteWebDriver rd = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),d);
		//d.get("http://www.gmail.com");
		//d.findElement(By.xpath(username));
		//d.findElement(By.xpath(password));
	}
		}
	@DataProvider(parallel=true)
	public Object[][] getdata()
	{
		
		Object[][] data = new Object[3][3];
		data[0][1] = "yogindra.malik@gmail.com" ;
		data[0][2] =  "India@12345" ;
		data[0][3] =  "firefox" ;
		
		data[0][1] = "yogindra.malik@gmail.com" ;
		data[0][2] =  "India@12345" ;
		data[0][3] =  "chrome" ;
		
		data[0][1] = "yogindra.malik@gmail.com" ;
		data[0][2] =  "India@12345" ;
		data[0][3] =  "ie" ;
		
		
		return data;
		
	}
	

}
