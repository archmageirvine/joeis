package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140240 Decimal expansion of <code>arccos(7/8)</code>.
 * @author Sean A. Irvine
 */
public class A140240 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.acos(CR.valueOf(7).divide(CR.valueOf(8)));

  @Override
  protected CR getCR() {
    return N;
  }
}
