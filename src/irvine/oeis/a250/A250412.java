package irvine.oeis.a250;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A250412 Palindromic in bases 10 and 36.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A250412 extends FilterSequence {

  /** Construct the sequence. */
  public A250412() {
    super(1, new A002113(), k -> Predicates.PALINDROME.is(36, k));
  }
}
