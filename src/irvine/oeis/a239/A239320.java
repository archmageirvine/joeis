package irvine.oeis.a239;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A239320 Ternary happy numbers.
 * @author Sean A. Irvine
 */
public class A239320 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A239320() {
    super(1, k -> Predicates.HAPPY.is(3, k));
  }
}
