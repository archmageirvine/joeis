package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154102 Decimal expansion of log_23 (9).
 * @author Sean A. Irvine
 */
public class A154102 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
