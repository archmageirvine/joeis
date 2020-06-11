package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153202 Decimal expansion of <code>log_6 (5)</code>.
 * @author Sean A. Irvine
 */
public class A153202 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
