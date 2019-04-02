package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153204 Decimal expansion of log_8 (5).
 * @author Sean A. Irvine
 */
public class A153204 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log().divide(CR.valueOf(8).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
