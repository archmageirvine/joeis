package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153895 Decimal expansion of <code>log_21 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153895 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.valueOf(21).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
