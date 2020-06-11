package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154200 Decimal expansion of <code>log_7(12)</code>.
 * @author Sean A. Irvine
 */
public class A154200 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
