package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153495 Decimal expansion of log_9 (6).
 * @author Sean A. Irvine
 */
public class A153495 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
