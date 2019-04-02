package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179449 Decimal expansion of the volume of great icosahedron with edge length 1.
 * @author Sean A. Irvine
 */
public class A179449 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.subtract(CR.FIVE.sqrt()).multiply(CR.FIVE).divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
