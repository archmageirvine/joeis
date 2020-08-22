package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152747 Decimal expansion of log_9 (2).
 * @author Sean A. Irvine
 */
public class A152747 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
