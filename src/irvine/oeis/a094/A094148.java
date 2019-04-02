package irvine.oeis.a094;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A094148 Decimal expansion of log(3)/log(4).
 * @author Sean A. Irvine
 */
public class A094148 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
