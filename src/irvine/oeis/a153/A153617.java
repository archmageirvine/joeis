package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153617 Decimal expansion of <code>log_6 (7)</code>.
 * @author Sean A. Irvine
 */
public class A153617 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
