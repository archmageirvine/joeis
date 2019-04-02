package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153605 Decimal expansion of log_15 (6).
 * @author Sean A. Irvine
 */
public class A153605 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
