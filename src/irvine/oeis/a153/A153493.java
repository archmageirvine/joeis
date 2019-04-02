package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153493 Decimal expansion of log_8 (6).
 * @author Sean A. Irvine
 */
public class A153493 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.valueOf(8).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
