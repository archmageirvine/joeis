package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153201 Decimal expansion of log_4 <code>(5)</code>.
 * @author Sean A. Irvine
 */
public class A153201 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
