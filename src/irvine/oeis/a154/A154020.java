package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154020 Decimal expansion of log_21 (9).
 * @author Sean A. Irvine
 */
public class A154020 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.valueOf(21).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
