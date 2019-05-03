package irvine.oeis.a094;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A094214 Decimal expansion of <code>1/phi =</code> phi <code>- 1</code>.
 * @author Sean A. Irvine
 */
public class A094214 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt().subtract(CR.ONE).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
