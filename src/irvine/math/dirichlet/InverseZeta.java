package irvine.math.dirichlet;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Dirichlet series for 1 over the zeta function.
 * @author Sean A. Irvine
 */
class InverseZeta extends AbstractDs {

  private final int mM;
  private final int mC;

  /**
   * Construct the Dirichlet series for <code>zeta(m*s-c)</code>.
   * @param m multiplier
   * @param c shift
   */
  InverseZeta(final int m, final int c) {
    mM = m;
    mC = c;
  }

  /**
   * Construct the Dirichlet series for <code>1/zeta(m*s)</code>.
   * @param m multiplier
   */
  InverseZeta(final int m) {
    this(m, 0);
  }

  @Override
  public Z coeff(final Z n) {
    final Z root = n.root(mM);
    return root.auxiliary() == 1 ? Functions.MOBIUS.z(root).multiply(root.pow(mC)) : Z.ZERO;
  }
}
