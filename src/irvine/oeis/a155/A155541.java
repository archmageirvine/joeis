package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155541 Decimal expansion of <code>log_3 (21)</code>.
 * @author Sean A. Irvine
 */
public class A155541 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
