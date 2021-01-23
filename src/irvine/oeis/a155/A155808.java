package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155808 Decimal expansion of log_3 (23).
 * @author Sean A. Irvine
 */
public class A155808 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
