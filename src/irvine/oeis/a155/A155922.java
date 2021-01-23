package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155922 Decimal expansion of log_3 (24).
 * @author Sean A. Irvine
 */
public class A155922 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
