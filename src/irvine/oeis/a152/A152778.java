package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152778 Decimal expansion of <code>log_12 (2)</code>.
 * @author Sean A. Irvine
 */
public class A152778 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
