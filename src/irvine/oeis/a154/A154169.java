package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154169 Decimal expansion of <code>log_19 (10)</code>.
 * @author Sean A. Irvine
 */
public class A154169 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
