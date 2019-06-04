package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154848 Decimal expansion of <code>log_3 (17)</code>.
 * @author Sean A. Irvine
 */
public class A154848 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
