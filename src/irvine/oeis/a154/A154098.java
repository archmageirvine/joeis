package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154098 Decimal expansion of <code>log_22 (9)</code>.
 * @author Sean A. Irvine
 */
public class A154098 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.valueOf(22).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
