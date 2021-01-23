package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154016 Decimal expansion of log_17 (9).
 * @author Sean A. Irvine
 */
public class A154016 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
