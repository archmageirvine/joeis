package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154171 Decimal expansion of <code>log_21 (10)</code>.
 * @author Sean A. Irvine
 */
public class A154171 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(21).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
