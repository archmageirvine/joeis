package irvine.math.function;

import irvine.math.z.Z;

/**
 * Reverse the digits of a number and add to the original number.
 * @author Sean A. Irvine
 */
class ReverseAndAdd extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public Z z(final long base, Z n) {
    return Functions.REVERSE.z(base, n).add(n);
  }

  @Override
  public long l(final long base, long n) {
    return Functions.REVERSE.l(base, n) + n;
  }
}
