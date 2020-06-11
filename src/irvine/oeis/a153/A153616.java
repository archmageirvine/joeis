package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153616 Decimal expansion of <code>log_5 (7)</code>.
 * @author Sean A. Irvine
 */
public class A153616 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
