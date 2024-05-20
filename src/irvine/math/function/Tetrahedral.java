package irvine.math.function;

import irvine.math.z.Z;

/**
 * Tetrahedral numbers.
 * @author Sean A. Irvine
 */
class Tetrahedral extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.multiply(n.add(1)).multiply(n.add(2)).divide(6);
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(n).multiply(n + 1).multiply(n + 2).divide(6);
  }
}
