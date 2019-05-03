package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152914 Decimal expansion of <code>log_5 (3)</code>.
 * @author Sean A. Irvine
 */
public class A152914 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
