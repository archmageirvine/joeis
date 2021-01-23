package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154158 Decimal expansion of log_7(10).
 * @author Sean A. Irvine
 */
public class A154158 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
