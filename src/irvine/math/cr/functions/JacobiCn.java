package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The Jacobi cn function.
 * @author Sean A. Irvine
 */
class JacobiCn extends CrFunction2Cr {

  @Override
  public CR cr(final CR z, final CR m) {
    return CrFunctions.NEVILLE_THETA_C.cr(z, m).divide(CrFunctions.NEVILLE_THETA_N.cr(z, m));
  }
}
