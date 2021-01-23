package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154167 Decimal expansion of log_17 (10).
 * @author Sean A. Irvine
 */
public class A154167 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
