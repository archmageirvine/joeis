package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152590 Decimal expansion of <code>log_2(13)</code>.
 * @author Sean A. Irvine
 */
public class A152590 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
