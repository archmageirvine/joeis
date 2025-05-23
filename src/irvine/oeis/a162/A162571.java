package irvine.oeis.a162;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001043;

/**
 * A162571 Palindromes which are sums of two consecutive primes.
 * @author Georg Fischer
 */
public class A162571 extends FilterSequence {

  /** Construct the sequence. */
  public A162571() {
    super(1, new A001043(), v -> Predicates.PALINDROME.is(10, v));
  }
}
