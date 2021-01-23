package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154159 Decimal expansion of log_8 (10).
 * @author Sean A. Irvine
 */
public class A154159 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
