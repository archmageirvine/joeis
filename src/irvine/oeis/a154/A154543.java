package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154543 Decimal expansion of <code>log_4 (15)</code>.
 * @author Sean A. Irvine
 */
public class A154543 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
