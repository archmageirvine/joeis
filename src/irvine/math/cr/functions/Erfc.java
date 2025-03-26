package irvine.math.cr.functions;

import irvine.math.cr.CR;

/**
 * The complemented error function.
 * @author Sean A. Irvine
 */
class Erfc extends CrFunction1 {

  @Override
  public CR cr(final CR z) {
    return CR.ONE.subtract(CrFunctions.ERF.cr(z));
  }
}
