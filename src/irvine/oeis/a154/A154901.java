package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154901 Decimal expansion of log_21 (17).
 * @author Sean A. Irvine
 */
public class A154901 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.valueOf(21).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
