package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154859 Decimal expansion of log_9 (17).
 * @author Sean A. Irvine
 */
public class A154859 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
