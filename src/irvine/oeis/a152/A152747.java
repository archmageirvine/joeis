package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152747 Decimal expansion of log_9 <code>(2)</code>.
 * @author Sean A. Irvine
 */
public class A152747 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(9).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
