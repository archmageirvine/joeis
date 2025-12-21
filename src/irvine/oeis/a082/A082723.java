package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A082723 Palindromic nonagonal (or 9-gonal or enneagonal) numbers.
 * @author Sean A. Irvine
 */
public class A082723 extends FilterSequence {

  /** Construct the sequence. */
  public A082723() {
    super(1, new A002113().skip(), k -> Predicates.POLYGONAL.is(9, k));
  }
}
