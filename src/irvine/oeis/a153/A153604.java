package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153604 Decimal expansion of log_14 (6).
 * @author Sean A. Irvine
 */
public class A153604 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
