package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154860 Decimal expansion of log_10 (17).
 * @author Sean A. Irvine
 */
public class A154860 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.valueOf(10).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
