package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154751 Decimal expansion of <code>log_3(16)</code>.
 * @author Sean A. Irvine
 */
public class A154751 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(16).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
