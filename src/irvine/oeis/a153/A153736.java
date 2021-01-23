package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153736 Decimal expansion of log_24(7).
 * @author Sean A. Irvine
 */
public class A153736 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.valueOf(24).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
