package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153496 Decimal expansion of log_10 (6).
 * @author Sean A. Irvine
 */
public class A153496 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
