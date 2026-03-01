package irvine.math.function;

import irvine.math.z.Z;

/**
 * Return the previous palindrome not more than the given number.
 * @author Sean A. Irvine
 */
class TensComplement extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    Z s = Z.ONE;
    while (s.compareTo(n) <= 0) {
      s = s.multiply(10);
    }
    return s.subtract(n);
  }

  @Override
  public long l(final long n) {
    long s = 1;
    while (s <= n) {
      s *= 10L;
    }
    return s - n;
  }
}
