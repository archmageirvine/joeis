package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154166 Decimal expansion of log_16 (10).
 * @author Sean A. Irvine
 */
public class A154166 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(16).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
