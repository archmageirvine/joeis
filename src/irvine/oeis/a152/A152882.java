package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152882 Decimal expansion of log_23 (2).
 * @author Sean A. Irvine
 */
public class A152882 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
