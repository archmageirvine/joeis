package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154567 Decimal expansion of <code>log_6 (15)</code>.
 * @author Sean A. Irvine
 */
public class A154567 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
