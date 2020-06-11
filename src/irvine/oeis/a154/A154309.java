package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154309 Decimal expansion of <code>log_8 (13)</code>.
 * @author Sean A. Irvine
 */
public class A154309 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
