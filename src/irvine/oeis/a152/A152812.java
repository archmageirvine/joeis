package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152812 Decimal expansion of log_18 <code>(2)</code>.
 * @author Sean A. Irvine
 */
public class A152812 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(18).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
