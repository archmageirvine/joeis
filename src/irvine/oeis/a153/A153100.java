package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153100 Decimal expansion of <code>log_24 (3)</code>.
 * @author Sean A. Irvine
 */
public class A153100 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(24).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
