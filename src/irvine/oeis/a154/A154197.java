package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154197 Decimal expansion of <code>log_4 (12)</code>.
 * @author Sean A. Irvine
 */
public class A154197 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
