package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153791 Decimal expansion of log_11 (8).
 * @author Sean A. Irvine
 */
public class A153791 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.valueOf(11).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
