package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154265 Decimal expansion of log_5 <code>(13)</code>.
 * @author Sean A. Irvine
 */
public class A154265 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
