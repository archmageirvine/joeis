package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Scalar divide of a Dirichlet series.
 * @author Sean A. Irvine
 */
class ScalarDivide extends AbstractDs {

  private final Ds mF;
  private final Z mDiv;

  /**
   * Construct the negation of a Dirichlet series.
   * @param f series
   * @param d divisor
   */
  ScalarDivide(final Ds f, final Z d) {
    mF = f;
    mDiv = d;
  }

  @Override
  public Z coeff(final Z n) {
    return mF.coeff(n).divide(mDiv);
  }
}
