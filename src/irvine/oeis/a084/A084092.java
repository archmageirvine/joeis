package irvine.oeis.a084;
// Generated by gen_seq4.pl 2025-05-08.ack/filter at 2025-05-08 13:52

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000961;

/**
 * A084092 Prime power decimal palindromes.
 * @author Georg Fischer
 */
public class A084092 extends FilterSequence {

  /** Construct the sequence. */
  public A084092() {
    super(1, new A000961(), v -> Predicates.PALINDROME.is(10, v));
  }
}
