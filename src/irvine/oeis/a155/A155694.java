package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155694 Decimal expansion of log_3 (22).
 * @author Sean A. Irvine
 */
public class A155694 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
