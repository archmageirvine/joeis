package irvine.oeis.a104;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a084.A084843;

/**
 * A104444 Not the difference of two palindromes (where 0 is considered a palindrome).
 * @author Sean A. Irvine
 */
public class A104444 extends FilterSequence {

  /** Construct the sequence. */
  public A104444() {
    super(new A084843(), k -> !Predicates.PALINDROME.is(k));
  }
}

