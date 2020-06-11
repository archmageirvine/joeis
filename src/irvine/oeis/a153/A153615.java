package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153615 Decimal expansion of <code>log_4 (7)</code>.
 * @author Sean A. Irvine
 */
public class A153615 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
