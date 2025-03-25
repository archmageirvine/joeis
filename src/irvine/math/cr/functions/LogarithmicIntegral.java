package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The li function.
 * @author Sean A. Irvine
 */
class LogarithmicIntegral extends CrFunction1 {

  @Override
  public CR cr(final CR z) {
    final CR l = z.log();
    return new PrescaledEi(l).add(CR.GAMMA).add(l.abs().log());
  }
}
