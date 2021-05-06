package irvine.oeis.a102;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A102208 Decimal expansion of the volume of an icosahedron with unit edge length.
 * @author Sean A. Irvine
 */
public class A102208 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.multiply(CR.THREE.add(CR.FIVE.sqrt())).divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
