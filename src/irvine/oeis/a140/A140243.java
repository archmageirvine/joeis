package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140243 Decimal expansion of 180*arccos(11/16)/Pi.
 * @author Sean A. Irvine
 */
public class A140243 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.acos(CR.valueOf(11).divide(CR.valueOf(16))).multiply(180).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
