package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The beta function.
 * @author Sean A. Irvine
 */
class Beta extends CrFunction2Cr {

  @Override
  public CR cr(final CR x, final CR y) {
    return x.lnGamma().add(y.lnGamma()).subtract(x.add(y).lnGamma()).exp();
  }
}
