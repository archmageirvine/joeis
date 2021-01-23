package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154015 Decimal expansion of log_15 (9).
 * @author Sean A. Irvine
 */
public class A154015 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
