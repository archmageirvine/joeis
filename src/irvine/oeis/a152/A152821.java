package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152821 Decimal expansion of <code>log_20 (2)</code>.
 * @author Sean A. Irvine
 */
public class A152821 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(20).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
