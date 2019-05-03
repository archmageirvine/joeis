package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153102 Decimal expansion of <code>log_6 (4)</code>.
 * @author Sean A. Irvine
 */
public class A153102 extends DecimalExpansionSequence {

  private static final CR N = CR.FOUR.log().divide(CR.valueOf(6).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
