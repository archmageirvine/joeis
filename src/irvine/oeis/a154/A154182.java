package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154182 Decimal expansion of log_10 (11).
 * @author Sean A. Irvine
 */
public class A154182 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
