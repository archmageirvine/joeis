package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154911 Decimal expansion of log_6 (18).
 * @author Sean A. Irvine
 */
public class A154911 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
