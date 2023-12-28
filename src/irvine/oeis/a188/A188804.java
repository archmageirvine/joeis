package irvine.oeis.a188;
// manually 2021-09-14

import irvine.oeis.a189.A189044;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A188804 Continued fraction for (Pi - sqrt(-4 + Pi^2))/2.
 * @author Georg Fischer
 */
public class A188804 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A188804() {
    super(new A189044());
  }
}
