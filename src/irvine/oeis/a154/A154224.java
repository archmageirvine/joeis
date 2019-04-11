package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154224 Decimal expansion of log_4 <code>(13)</code>.
 * @author Sean A. Irvine
 */
public class A154224 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
