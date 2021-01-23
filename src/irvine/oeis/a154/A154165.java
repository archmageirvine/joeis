package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154165 Decimal expansion of log_15 (10).
 * @author Sean A. Irvine
 */
public class A154165 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
