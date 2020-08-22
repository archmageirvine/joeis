package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154199 Decimal expansion of log_6 (12).
 * @author Sean A. Irvine
 */
public class A154199 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
