package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153202 Decimal expansion of log_6 <code>(5)</code>.
 * @author Sean A. Irvine
 */
public class A153202 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.valueOf(6).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
