package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153739 Decimal expansion of <code>log_5 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153739 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
