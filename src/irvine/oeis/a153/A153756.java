package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153756 Decimal expansion of <code>log_9 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153756 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
