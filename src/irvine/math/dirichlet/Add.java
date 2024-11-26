package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Sum of two Dirichlet series.
 * @author Sean A. Irvine
 */
class Add extends AbstractDs {

  private final Ds mF;
  private final Ds mG;

  /**
   * Construct the sum of two Dirichlet series.
   * @param f first series
   * @param g second series
   */
  Add(final Ds f, final Ds g) {
    mF = f;
    mG = g;
  }

  @Override
  public Z coeff(final Z n) {
    return mF.coeff(n).add(mG.coeff(n));
  }
}
