package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154164 Decimal expansion of log_14 (10).
 * @author Sean A. Irvine
 */
public class A154164 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
