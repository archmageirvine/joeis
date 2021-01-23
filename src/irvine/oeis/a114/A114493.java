package irvine.oeis.a114;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A114493 Decimal expansion of log_10(4).
 * @author Sean A. Irvine
 */
public class A114493 extends DecimalExpansionSequence {

  private static final CR N = CR.FOUR.log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
