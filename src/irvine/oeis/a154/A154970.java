package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154970 Decimal expansion of log_13 (18).
 * @author Sean A. Irvine
 */
public class A154970 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.valueOf(13).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
