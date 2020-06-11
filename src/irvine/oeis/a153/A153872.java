package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153872 Decimal expansion of <code>log_20 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153872 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
