package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154339 Decimal expansion of log_9 (13).
 * @author Sean A. Irvine
 */
public class A154339 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
