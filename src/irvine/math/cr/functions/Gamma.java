package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The gamma function.
 * @author Sean A. Irvine
 */
class Gamma extends CrFunction1 {

  @Override
  public CR cr(final CR z) {
    return z.lnGamma().exp();
  }
}
