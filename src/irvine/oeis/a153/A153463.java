package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153463 Decimal expansion of log_7(6).
 * @author Sean A. Irvine
 */
public class A153463 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
