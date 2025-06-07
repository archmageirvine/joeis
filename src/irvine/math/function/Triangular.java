package irvine.math.function;

import irvine.math.z.Z;

/**
 * Triangular numbers.
 * @author Sean A. Irvine
 */
class Triangular extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.multiply(n.add(1)).divide2();
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(n).multiply(n + 1).divide2();
  }
}
