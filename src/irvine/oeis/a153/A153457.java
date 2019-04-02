package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153457 Decimal expansion of log_23 (5).
 * @author Sean A. Irvine
 */
public class A153457 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
