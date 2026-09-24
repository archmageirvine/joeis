package irvine.oeis.a250;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A250411 Palindromic in bases 10 and 27.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A250411 extends FilterSequence {

  /** Construct the sequence. */
  public A250411() {
    super(1, new A002113(), k -> Predicates.PALINDROME.is(27, k));
  }
}
