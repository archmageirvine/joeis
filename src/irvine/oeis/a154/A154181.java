package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154181 Decimal expansion of log_9 (11).
 * @author Sean A. Irvine
 */
public class A154181 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
