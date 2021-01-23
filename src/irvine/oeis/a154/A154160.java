package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154160 Decimal expansion of log_9 (10).
 * @author Sean A. Irvine
 */
public class A154160 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
