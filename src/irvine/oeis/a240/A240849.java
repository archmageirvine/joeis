package irvine.oeis.a240;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A240849 Quinary happy numbers.
 * @author Sean A. Irvine
 */
public class A240849 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A240849() {
    super(1, k -> Predicates.HAPPY.is(5, k));
  }
}
