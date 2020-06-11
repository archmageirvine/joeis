package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152935 Decimal expansion of <code>log_6 (3)</code>.
 * @author Sean A. Irvine
 */
public class A152935 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
