package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153586 Decimal expansion of log_11 (6).
 * @author Sean A. Irvine
 */
public class A153586 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.valueOf(11).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
