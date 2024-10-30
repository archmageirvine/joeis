package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The Jacobi ds function.
 * @author Sean A. Irvine
 */
class JacobiDs extends CrFunction2Cr {

  @Override
  public CR cr(final CR z, final CR m) {
    return CrFunctions.NEVILLE_THETA_D.cr(z, m).divide(CrFunctions.NEVILLE_THETA_S.cr(z, m));
  }
}
