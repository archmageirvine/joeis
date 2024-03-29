package irvine.oeis.a339;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A339261 Decimal expansion of the conjecturally maximum possible volume of a polyhedron with 9 vertices inscribed in the unit sphere.
 * @author Georg Fischer
 */
public class A339261 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A339261() {
    super(1, CR.THREE.multiply(CR.TWO.multiply(CR.THREE.sqrt()).subtract(CR.THREE).sqrt()));
  }
}
