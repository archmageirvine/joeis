package irvine.oeis.a250;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A250409 Palindromic in bases 10 and 24.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A250409 extends FilterSequence {

  /** Construct the sequence. */
  public A250409() {
    super(1, new A002113(), k -> Predicates.PALINDROME.is(24, k));
  }
}
