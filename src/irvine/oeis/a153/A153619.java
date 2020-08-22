package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153619 Decimal expansion of log_9 (7).
 * @author Sean A. Irvine
 */
public class A153619 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
