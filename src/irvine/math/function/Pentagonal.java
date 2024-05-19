package irvine.math.function;

import irvine.math.z.Z;

/**
 * Pentagonal function.
 * @author Sean A. Irvine
 */
class Pentagonal extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.multiply(n.multiply(3).subtract(1)).divide2();
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(3L * n - 1).multiply(n).divide2();
  }
}
