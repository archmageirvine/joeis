package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154177 Decimal expansion of <code>log_5 (11)</code>.
 * @author Sean A. Irvine
 */
public class A154177 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
