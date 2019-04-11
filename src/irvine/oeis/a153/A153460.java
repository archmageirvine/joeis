package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153460 Decimal expansion of log_4 <code>(6)</code>.
 * @author Sean A. Irvine
 */
public class A153460 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
