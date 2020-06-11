package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152713 Decimal expansion of <code>log_7(2)</code>.
 * @author Sean A. Irvine
 */
public class A152713 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
