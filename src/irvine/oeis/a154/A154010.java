package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154010 Decimal expansion of <code>log_8 (9)</code>.
 * @author Sean A. Irvine
 */
public class A154010 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
