package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154972 Decimal expansion of log_15 (18).
 * @author Sean A. Irvine
 */
public class A154972 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
