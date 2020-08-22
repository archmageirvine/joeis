package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154578 Decimal expansion of log_9 (15).
 * @author Sean A. Irvine
 */
public class A154578 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
