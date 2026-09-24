package irvine.oeis.a319;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A319585 Numbers in base 10 that are palindromic in bases 2, 8, and 16.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A319585 extends FilterSequence {

  /** Construct the sequence. */
  public A319585() {
    super(1, new A002113(), k -> Predicates.PALINDROME.is(2, k) && Predicates.PALINDROME.is(8, k) && Predicates.PALINDROME.is(16, k));
  }
}
