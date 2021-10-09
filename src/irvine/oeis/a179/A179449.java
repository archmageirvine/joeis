package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A179449 Decimal expansion of the volume of great icosahedron with edge length 1.
 * @author Sean A. Irvine
 */
public class A179449 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179449() {
    super(CR.THREE.subtract(CR.FIVE.sqrt()).multiply(CR.FIVE).divide(CR.valueOf(12)));
  }
}
