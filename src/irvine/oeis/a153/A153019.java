package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153019 Decimal expansion of <code>log_16 (3)</code>.
 * @author Sean A. Irvine
 */
public class A153019 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(16).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
