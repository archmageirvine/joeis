package irvine.oeis.a065;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A065378 Primes p such that p^2 is a palindromic square.
 * @author Sean A. Irvine
 */
public class A065378 extends FilterSequence {

  /** Construct the sequence. */
  public A065378() {
    super(new A000040(), k -> Predicates.PALINDROME.is(10, k.square()));
  }
}
