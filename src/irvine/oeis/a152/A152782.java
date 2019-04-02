package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152782 Decimal expansion of log_17 (2).
 * @author Sean A. Irvine
 */
public class A152782 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
