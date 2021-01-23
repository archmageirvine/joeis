package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153589 Decimal expansion of log_12 (6).
 * @author Sean A. Irvine
 */
public class A153589 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
