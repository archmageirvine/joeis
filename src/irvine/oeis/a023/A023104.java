package irvine.oeis.a023;

/**
 * A023104 (2^n)-th digit of infinite string 12345678910111213141516...
 * @author Sean A. Irvine
 */
public class A023104 extends A023103 {

  @Override
  protected int multiplier() {
    return 2;
  }
}
