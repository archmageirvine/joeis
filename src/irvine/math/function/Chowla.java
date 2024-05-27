package irvine.math.function;

import irvine.math.z.Z;

/**
 * Chowla function.
 * @author Sean A. Irvine
 */
class Chowla extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Z.ONE.equals(n) ? Z.ZERO : Functions.SIGMA.z(n).subtract(n).subtract(1);
  }

  @Override
  public long l(final long n) {
    return n == 1 ? 0 : Functions.SIGMA.l(n) - n - 1;
  }
}
