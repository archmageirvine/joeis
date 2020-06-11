package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154572 Decimal expansion of <code>log_7(15)</code>.
 * @author Sean A. Irvine
 */
public class A154572 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
