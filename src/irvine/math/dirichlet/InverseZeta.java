package irvine.math.dirichlet;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Dirichlet series for 1 over the zeta function.
 * @author Sean A. Irvine
 */
class InverseZeta extends AbstractDs {

  private final int mM;

  /**
   * Construct the Dirichlet series for <code>1/zeta(m*s)</code>.
   * @param m multiplier
   */
  InverseZeta(final int m) {
    mM = m;
  }

  @Override
  public Z coeff(final Z n) {
    final Z root = n.root(mM);
    return root.auxiliary() == 1 ? Functions.MOBIUS.z(root) : Z.ZERO;
  }
}
