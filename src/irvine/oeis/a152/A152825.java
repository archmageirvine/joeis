package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152825 Decimal expansion of log_21 (2).
 * @author Sean A. Irvine
 */
public class A152825 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(21).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
