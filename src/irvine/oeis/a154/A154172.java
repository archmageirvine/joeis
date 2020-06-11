package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154172 Decimal expansion of <code>log_22 (10)</code>.
 * @author Sean A. Irvine
 */
public class A154172 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(22).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
