package irvine.oeis.a249;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a029.A029954;

/**
 * A249158 Palindromic in bases 7 and 29.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A249158 extends FilterSequence {

  /** Construct the sequence. */
  public A249158() {
    super(1, new A029954(), k -> Predicates.PALINDROME.is(29, k));
  }
}
