package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154793 Decimal expansion of log_7(16).
 * @author Sean A. Irvine
 */
public class A154793 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(16).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
