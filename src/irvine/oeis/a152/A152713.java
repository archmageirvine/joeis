package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152713 Decimal expansion of log_7(2).
 * @author Sean A. Irvine
 */
public class A152713 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(7).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
