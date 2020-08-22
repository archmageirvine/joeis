package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153612 Decimal expansion of log_22 (6).
 * @author Sean A. Irvine
 */
public class A153612 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.valueOf(22).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
