package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153629 Decimal expansion of log_19 (7).
 * @author Sean A. Irvine
 */
public class A153629 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
