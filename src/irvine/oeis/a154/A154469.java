package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154469 Decimal expansion of log_9 (14).
 * @author Sean A. Irvine
 */
public class A154469 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
