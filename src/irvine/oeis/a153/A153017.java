package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153017 Decimal expansion of <code>log_14 (3)</code>.
 * @author Sean A. Irvine
 */
public class A153017 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
