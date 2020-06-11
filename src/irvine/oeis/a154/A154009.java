package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154009 Decimal expansion of <code>log_6 (9)</code>.
 * @author Sean A. Irvine
 */
public class A154009 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
