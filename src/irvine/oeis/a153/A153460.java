package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153460 Decimal expansion of <code>log_4 (6)</code>.
 * @author Sean A. Irvine
 */
public class A153460 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
