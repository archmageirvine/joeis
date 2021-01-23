package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152781 Decimal expansion of log_15 (2).
 * @author Sean A. Irvine
 */
public class A152781 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
