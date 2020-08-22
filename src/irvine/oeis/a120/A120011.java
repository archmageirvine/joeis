package irvine.oeis.a120;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A120011 Decimal expansion of sqrt(3)/4.
 * @author Sean A. Irvine
 */
public class A120011 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt().divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
