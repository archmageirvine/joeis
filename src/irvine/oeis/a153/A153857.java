package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153857 Decimal expansion of <code>log_15 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153857 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
