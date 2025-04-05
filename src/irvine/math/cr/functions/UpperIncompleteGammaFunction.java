package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The upper incomplete gamma function.
 * @author Sean A. Irvine
 */
class UpperIncompleteGammaFunction extends CrFunction2Cr {

  @Override
  public CR cr(final CR v, final CR z) {
    return v.signum(-32) == 0
      ? CrFunctions.EI.cr(z.negate()).negate()
      : CrFunctions.GAMMA.cr(z).subtract(CrFunctions.LOWER_INCOMPLETE_GAMMA.cr(v, z));
  }
}
