package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153205 Decimal expansion of log_9 (5).
 * @author Sean A. Irvine
 */
public class A153205 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
