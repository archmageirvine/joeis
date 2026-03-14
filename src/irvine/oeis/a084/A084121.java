package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A084121 Primes p_n such that n*p_n is a palindrome.
 * @author Sean A. Irvine
 */
public class A084121 extends FilterSequence {

  /** Construct the sequence. */
  public A084121() {
    super(1, new A000040(), (n, p) -> Predicates.PALINDROME.is(p.multiply(n)));
  }
}

