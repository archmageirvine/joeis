package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154947 Decimal expansion of log_9 (18).
 * @author Sean A. Irvine
 */
public class A154947 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
