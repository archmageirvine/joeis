package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Dirichlet series for the zeta function.
 * @author Sean A. Irvine
 */
class Zeta extends AbstractDs {

  private final int mM;
  private final int mC;

  /**
   * Construct the Dirichlet series for <code>zeta(m*s-c)</code>.
   * @param m multiplier
   * @param c shift
   */
  Zeta(final int m, final int c) {
    mM = m;
    mC = c;
  }

  /**
   * Construct the Dirichlet series for <code>zeta(m*s)</code>.
   * @param m multiplier
   */
  Zeta(final int m) {
    this(m, 0);
  }

  @Override
  public Z coeff(final Z n) {
    final Z r = n.root(mM);
    return r.auxiliary() == 1 ? r.pow(mC) : Z.ZERO;
  }
}
