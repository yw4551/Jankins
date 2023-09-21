package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jankins {
	
	@Test
	public void test() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		driver.get("https://selenium.teachable.com/");
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		driver.quit();
	}

}
