package irvine.oeis.a248;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A248899 Numbers that are palindromic in bases 10 and 19.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A248899 extends FilterSequence {

  /** Construct the sequence. */
  public A248899() {
    super(1, new A002113(), k -> Predicates.PALINDROME.is(19, k));
  }
}
