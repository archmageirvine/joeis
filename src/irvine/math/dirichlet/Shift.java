package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Shift of a Dirichlet series.
 * @author Sean A. Irvine
 */
class Shift extends AbstractDs {

  private final Ds mF;
  private final Z mShift;

  /**
   * Construct the shift <code>s->s+shift</code> in a Dirichlet series.
   * @param f series
   * @param shift shift
   */
  Shift(final Ds f, final Z shift) {
    mF = f;
    mShift = shift;
  }

  @Override
  public Z coeff(final Z n) {
    return mF.coeff(n).multiply(n.pow(mShift));
  }
}
