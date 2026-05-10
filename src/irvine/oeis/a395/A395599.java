package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395599 Decimal expansion of the probability that two points that are independently and uniformly selected at random within the interior of an equilateral triangle are separated by a line whose direction and perpendicular distance from the origin are independently and uniformly selected at random, given that the line intersects the triangle.
 * @author Sean A. Irvine
 */
public class A395599 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395599() {
    super(0, CR.THREE.log().divide(10).add(new Q(2, 15)));
  }
}

