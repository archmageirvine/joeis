package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154759 Decimal expansion of log_5 (16).
 * @author Sean A. Irvine
 */
public class A154759 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(16).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
