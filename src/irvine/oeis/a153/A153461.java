package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153461 Decimal expansion of log_5 <code>(6)</code>.
 * @author Sean A. Irvine
 */
public class A153461 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
