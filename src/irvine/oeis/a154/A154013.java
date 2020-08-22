package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154013 Decimal expansion of log_13 (9).
 * @author Sean A. Irvine
 */
public class A154013 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.valueOf(13).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
