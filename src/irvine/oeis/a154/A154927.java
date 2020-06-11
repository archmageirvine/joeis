package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154927 Decimal expansion of <code>log_8 (18)</code>.
 * @author Sean A. Irvine
 */
public class A154927 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
