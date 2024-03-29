package irvine.oeis.a330;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A330646 Decimal expansion of the mean length of a line segment drawn by picking a random point on a unit length equilateral triangle and extending it in a random direction until it meets an edge.
 * @author Georg Fischer
 */
public class A330646 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A330646() {
    super(0, CR.THREE.sqrt().multiply(CR.THREE.log()).divide(CR.TWO.multiply(CR.PI)));
  }
}
