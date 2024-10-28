package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The elliptic K function.
 * @author Sean A. Irvine
 */
class EllipticK extends CrFunction1 {

  @Override
  public CR cr(final CR z) {
    return CR.HALF_PI.divide(CR.ONE.agm(CR.ONE.subtract(z.square()).sqrt()));
  }
}
