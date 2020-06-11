package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154202 Decimal expansion of <code>log_9 (12)</code>.
 * @author Sean A. Irvine
 */
public class A154202 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
