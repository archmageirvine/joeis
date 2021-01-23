package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152901 Decimal expansion of log_24 (2).
 * @author Sean A. Irvine
 */
public class A152901 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(24).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
