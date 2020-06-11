package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153603 Decimal expansion of <code>log_13 (6)</code>.
 * @author Sean A. Irvine
 */
public class A153603 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.valueOf(13).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
