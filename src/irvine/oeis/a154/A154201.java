package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154201 Decimal expansion of <code>log_8 (12)</code>.
 * @author Sean A. Irvine
 */
public class A154201 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
