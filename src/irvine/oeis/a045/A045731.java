package irvine.oeis.a045;

/**
 * A045731 Fibonacci numbers having initial digit '7'.
 * @author Sean A. Irvine
 */
public class A045731 extends A045725 {

  {
    setOffset(0);
  }

  @Override
  protected String prefix() {
    return "7";
  }
}
