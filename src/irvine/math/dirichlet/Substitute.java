package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Substitution of a Dirichlet series.
 * @author Sean A. Irvine
 */
class Substitute extends AbstractDs {

  private final Ds mF;
  private final int mM;

  /**
   * Construct the substitution <code>s->s^m</code> in a Dirichlet series.
   * @param f series
   * @param m power
   */
  Substitute(final Ds f, final int m) {
    mF = f;
    mM = m;
  }

  @Override
  public Z coeff(final Z n) {
    final Z r = n.root(mM);
    return r.auxiliary() == 1 ? mF.coeff(r) : Z.ZERO;
  }
}
