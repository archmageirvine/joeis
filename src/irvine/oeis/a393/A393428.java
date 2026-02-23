package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393428 Decimal expansion of the probability that the centroid of a given regular pentagon lies within the triangle formed by three points chosen uniformly and independently at random from the interior of that pentagon.
 * @author Sean A. Irvine
 */
public class A393428 extends DecimalExpansionSequence {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A393428() {
    super(0, SQRT5.multiply(73).add(165).multiply(SQRT5.subtract(1).log()).subtract(SQRT5.multiply(3).add(2).multiply(5)).multiply(new Q(6, 625)));
  }
}
