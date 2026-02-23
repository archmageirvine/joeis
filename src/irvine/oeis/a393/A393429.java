package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393429 Decimal expansion of the probability that the origin lies within the triangle formed by three points chosen uniformly and independently at random from the interior of a disk of radius R centered at the origin, with a circular hole of radius R/2 whose center is at (R/2, 0).
 * @author Sean A. Irvine
 */
public class A393429 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393429() {
    super(0, CR.valueOf(new Q(2, 9)).subtract(CR.FIVE.divide(CR.PI.square().multiply(18))));
  }
}
