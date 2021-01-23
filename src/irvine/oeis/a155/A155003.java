package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155003 Decimal expansion of log_3 (19).
 * @author Sean A. Irvine
 */
public class A155003 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log().divide(CR.THREE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
