package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393430 Decimal expansion of the probability that the cusp of a given cardioid lies within the triangle formed by three points chosen uniformly and independently at random from the interior of that cardioid.
 * @author Sean A. Irvine
 */
public class A393430 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393430() {
    super(0, CR.valueOf(Q.ONE_QUARTER).subtract(CR.valueOf(20).divide(CR.PI.square().multiply(9))));
  }
}
