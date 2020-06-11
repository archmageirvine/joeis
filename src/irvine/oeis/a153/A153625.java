package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153625 Decimal expansion of <code>log_15 (7)</code>.
 * @author Sean A. Irvine
 */
public class A153625 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
