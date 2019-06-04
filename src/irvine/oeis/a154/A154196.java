package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154196 Decimal expansion of <code>log_3 (12)</code>.
 * @author Sean A. Irvine
 */
public class A154196 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
