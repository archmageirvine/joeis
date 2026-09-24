package irvine.oeis.a250;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A250408 Palindromic in bases 10 and 20.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A250408 extends FilterSequence {

  /** Construct the sequence. */
  public A250408() {
    super(1, new A002113(), k -> Predicates.PALINDROME.is(20, k));
  }
}
