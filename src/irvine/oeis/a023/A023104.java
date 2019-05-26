package irvine.oeis.a023;

/**
 * A023104 <code>(2^n)-th</code> digit of infinite string 12345678910111213141516...
 * @author Sean A. Irvine
 */
public class A023104 extends A023103 {

  @Override
  protected int multiplier() {
    return 2;
  }
}
