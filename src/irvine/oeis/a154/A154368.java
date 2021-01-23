package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154368 Decimal expansion of log_10 (13).
 * @author Sean A. Irvine
 */
public class A154368 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
