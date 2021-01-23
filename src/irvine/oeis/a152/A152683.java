package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152683 Decimal expansion of log_6 (2).
 * @author Sean A. Irvine
 */
public class A152683 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
