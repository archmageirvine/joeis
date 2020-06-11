package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154180 Decimal expansion of <code>log_8 (11)</code>.
 * @author Sean A. Irvine
 */
public class A154180 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
