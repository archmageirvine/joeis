package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154688 Decimal expansion of log_18 (15).
 * @author Sean A. Irvine
 */
public class A154688 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.valueOf(18).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
