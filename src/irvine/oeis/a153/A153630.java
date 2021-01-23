package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153630 Decimal expansion of log_20 (7).
 * @author Sean A. Irvine
 */
public class A153630 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
