package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152858 Decimal expansion of log_22 <code>(2)</code>.
 * @author Sean A. Irvine
 */
public class A152858 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(22).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
