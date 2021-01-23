package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154014 Decimal expansion of log_14 (9).
 * @author Sean A. Irvine
 */
public class A154014 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
