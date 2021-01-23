package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153870 Decimal expansion of log_18 (8).
 * @author Sean A. Irvine
 */
public class A153870 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.valueOf(18).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
