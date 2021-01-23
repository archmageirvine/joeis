package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153735 Decimal expansion of log_23 (7).
 * @author Sean A. Irvine
 */
public class A153735 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
