package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154217 Decimal expansion of <code>log_3 (13)</code>.
 * @author Sean A. Irvine
 */
public class A154217 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
