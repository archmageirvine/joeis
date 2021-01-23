package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153971 Decimal expansion of log_22 (8).
 * @author Sean A. Irvine
 */
public class A153971 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.valueOf(22).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
