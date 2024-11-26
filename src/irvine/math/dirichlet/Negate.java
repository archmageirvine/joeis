package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Negation of a Dirichlet series.
 * @author Sean A. Irvine
 */
class Negate extends AbstractDs {

  private final Ds mF;

  /**
   * Construct the negation of a Dirichlet series.
   * @param f series
   */
  Negate(final Ds f) {
    mF = f;
  }

  @Override
  public Z coeff(final Z n) {
    return mF.coeff(n).negate();
  }
}
