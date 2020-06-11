package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153755 Decimal expansion of <code>log_7(8)</code>.
 * @author Sean A. Irvine
 */
public class A153755 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
