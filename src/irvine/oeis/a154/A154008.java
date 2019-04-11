package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154008 Decimal expansion of log_5 <code>(9)</code>.
 * @author Sean A. Irvine
 */
public class A154008 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(9).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
