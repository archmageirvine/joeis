package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The Jacobi sc function.
 * @author Sean A. Irvine
 */
class JacobiSc extends CrFunction2Cr {

  @Override
  public CR cr(final CR z, final CR m) {
    return CrFunctions.NEVILLE_THETA_S.cr(z, m).divide(CrFunctions.NEVILLE_THETA_C.cr(z, m));
  }
}
