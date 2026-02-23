package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393427 Decimal expansion of the probability that the centroid of a given triangle lies within the triangle formed by three points chosen uniformly and independently at random from the interior of that given triangle.
 * @author Sean A. Irvine
 */
public class A393427 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393427() {
    super(0, CR.LOG2.multiply(20).divide(81).add(new Q(2, 27)));
  }
}
