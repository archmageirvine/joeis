package irvine.oeis.a169;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a073.A073485;

/**
 * A169829 Palindromes that are a product of consecutive primes.
 * @author Georg Fischer
 */
public class A169829 extends FilterSequence {

  /** Construct the sequence. */
  public A169829() {
    super(1, new A073485(), v -> Predicates.PALINDROME.is(v));
  }
}
