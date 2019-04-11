package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154849 Decimal expansion of log_4 <code>(17)</code>.
 * @author Sean A. Irvine
 */
public class A154849 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
