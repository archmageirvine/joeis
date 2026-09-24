package irvine.oeis.a248;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A248889 Palindromic in base 10 and 18.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A248889 extends FilterSequence {

  /** Construct the sequence. */
  public A248889() {
    super(1, new A002113(), k -> Predicates.PALINDROME.is(18, k));
  }
}
