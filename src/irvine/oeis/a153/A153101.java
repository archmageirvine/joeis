package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153101 Decimal expansion of log_5 (4).
 * @author Sean A. Irvine
 */
public class A153101 extends DecimalExpansionSequence {

  private static final CR N = CR.FOUR.log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
