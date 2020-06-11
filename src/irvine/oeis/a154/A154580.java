package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154580 Decimal expansion of <code>log_10 (15)</code>.
 * @author Sean A. Irvine
 */
public class A154580 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
