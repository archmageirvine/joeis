package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154463 Decimal expansion of log_3 (14).
 * @author Sean A. Irvine
 */
public class A154463 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
