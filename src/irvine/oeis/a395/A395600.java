package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395600 Decimal expansion of the expected area of the triangular part formed by intersecting a unit-area equilateral triangle with a random line whose direction and perpendicular distance from the origin are independently and uniformly selected at random, given that the line intersects the triangle.
 * @author Sean A. Irvine
 */
public class A395600 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395600() {
    super(0, CR.THREE.log().divide(2).subtract(Q.ONE_THIRD));
  }
}

