package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152780 Decimal expansion of <code>log_14 (2)</code>.
 * @author Sean A. Irvine
 */
public class A152780 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
