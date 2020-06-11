package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154162 Decimal expansion of <code>log_12 (10)</code>.
 * @author Sean A. Irvine
 */
public class A154162 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
