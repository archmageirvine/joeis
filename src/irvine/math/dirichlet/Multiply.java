package irvine.math.dirichlet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Product of two Dirichlet series.
 * @author Sean A. Irvine
 */
class Multiply extends AbstractDs {

  private final Ds mF;
  private final Ds mG;

  /**
   * Construct the product of two Dirichlet series.
   * @param f first series
   * @param g second series
   */
  Multiply(final Ds f, final Ds g) {
    mF = f;
    mG = g;
  }

  @Override
  public Z coeff(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      final Z a = mF.coeff(d);
      if (!a.isZero()) {
        final Z b = mG.coeff(n.divide(d));
        sum = sum.add(a.multiply(b));
      }
    }
    return sum;
  }
}
