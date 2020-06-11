package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153606 Decimal expansion of <code>log_16 (6)</code>.
 * @author Sean A. Irvine
 */
public class A153606 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.valueOf(16).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
