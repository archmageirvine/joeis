package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153611 Decimal expansion of log_21 (6).
 * @author Sean A. Irvine
 */
public class A153611 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.valueOf(21).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
