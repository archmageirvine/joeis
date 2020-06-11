package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154018 Decimal expansion of <code>log_19 (9)</code>.
 * @author Sean A. Irvine
 */
public class A154018 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
