package irvine.oeis.a094;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A094874 Decimal expansion of <code>(5-sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A094874 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.subtract(CR.FIVE.sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
