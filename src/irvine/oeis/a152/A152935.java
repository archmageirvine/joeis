package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152935 Decimal expansion of log_6 (3).
 * @author Sean A. Irvine
 */
public class A152935 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(6).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
