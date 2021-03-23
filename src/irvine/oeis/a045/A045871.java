package irvine.oeis.a045;

/**
 * A045871 Numbers n with the property that in the list of divisors of n (in octal), each digit 0-7 appears equally often.
 * @author Sean A. Irvine
 */
public class A045871 extends A045869 {

  @Override
  protected int base() {
    return 8;
  }
}
