package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153790 Decimal expansion of <code>log_10 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153790 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
