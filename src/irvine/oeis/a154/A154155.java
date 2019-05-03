package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154155 Decimal expansion of <code>log_4 (10)</code>.
 * @author Sean A. Irvine
 */
public class A154155 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
