package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152945 Decimal expansion of <code>log_7(3)</code>.
 * @author Sean A. Irvine
 */
public class A152945 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
