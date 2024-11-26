package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Scalar multiplication of a Dirichlet series.
 * @author Sean A. Irvine
 */
class ScalarMultiply extends AbstractDs {

  private final Ds mF;
  private final Z mMul;

  /**
   * Construct the negation of a Dirichlet series.
   * @param f series
   */
  ScalarMultiply(final Ds f, final Z m) {
    mF = f;
    mMul = m;
  }

  @Override
  public Z coeff(final Z n) {
    return mF.coeff(n).multiply(mMul);
  }
}
