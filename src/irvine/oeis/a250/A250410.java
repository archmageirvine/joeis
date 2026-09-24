package irvine.oeis.a250;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A250410 Numbers palindromic in bases 10 and 25.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A250410 extends FilterSequence {

  /** Construct the sequence. */
  public A250410() {
    super(1, new A002113(), k -> Predicates.PALINDROME.is(25, k));
  }
}
