package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154478 Decimal expansion of log_10 (14).
 * @author Sean A. Irvine
 */
public class A154478 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
