package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153620 Decimal expansion of log_10 (7).
 * @author Sean A. Irvine
 */
public class A153620 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
