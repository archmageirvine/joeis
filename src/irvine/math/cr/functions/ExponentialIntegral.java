package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The Ei function.
 * @author Sean A. Irvine
 */
class ExponentialIntegral extends CrFunction1 {

  @Override
  public CR cr(final CR z) {
    return new PrescaledEi(z).add(CR.GAMMA).add(z.abs().log());
  }
}
