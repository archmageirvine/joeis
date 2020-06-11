package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153614 Decimal expansion of <code>log_24 (6)</code>.
 * @author Sean A. Irvine
 */
public class A153614 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.valueOf(24).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
