package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153459 Decimal expansion of <code>log_3 (6)</code>.
 * @author Sean A. Irvine
 */
public class A153459 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
