package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Sum of two Dirichlet series.
 * @author Sean A. Irvine
 */
class Subtract extends AbstractDs {

  private final Ds mF;
  private final Ds mG;

  /**
   * Construct the difference of two Dirichlet series.
   * @param f first series
   * @param g second series
   */
  Subtract(final Ds f, final Ds g) {
    mF = f;
    mG = g;
  }

  @Override
  public Z coeff(final Z n) {
    return mF.coeff(n).subtract(mG.coeff(n));
  }
}
