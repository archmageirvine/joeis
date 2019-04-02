package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152945 Decimal expansion of log_7(3).
 * @author Sean A. Irvine
 */
public class A152945 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(7).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
