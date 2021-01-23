package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153613 Decimal expansion of log_23 (6).
 * @author Sean A. Irvine
 */
public class A153613 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
