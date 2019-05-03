package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152683 Decimal expansion of <code>log_6 (2)</code>.
 * @author Sean A. Irvine
 */
public class A152683 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(6).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
