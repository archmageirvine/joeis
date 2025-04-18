package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The Weber E function.
 * @author Sean A. Irvine
 */
class WeberE extends CrFunction2Cr {

  @Override
  public CR cr(final CR v, final CR z) {
    final CR a = CR.HALF_PI.multiply(v);
    return AngerJ.sum1(v, z).multiply(a.sin())
      .subtract(AngerJ.sum2(v, z).multiply(a.cos()));
  }
}
