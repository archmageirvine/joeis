package irvine.oeis.a072;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a037.A037449;

/**
 * A072904 Nonsquares m such that the discriminant of the quadratic field Q(sqrt(m)) &lt; m.
 * @author Sean A. Irvine
 */
public class A072904 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072904() {
    super(1, 1, new A037449(), (n, k) -> k.compareTo(n) < 0 && !Predicates.SQUARE.is(n));
  }
}

