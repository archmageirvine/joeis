package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152974 Decimal expansion of log_11 <code>(3)</code>.
 * @author Sean A. Irvine
 */
public class A152974 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(11).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
