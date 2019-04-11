package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153021 Decimal expansion of log_18 <code>(3)</code>.
 * @author Sean A. Irvine
 */
public class A153021 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(18).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
