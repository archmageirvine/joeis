package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154173 Decimal expansion of <code>log_23 (10)</code>.
 * @author Sean A. Irvine
 */
public class A154173 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
