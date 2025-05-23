package irvine.oeis.a333;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046807;

/**
 * A333421 Primes that are palindromic in factorial base.
 * @author Georg Fischer
 */
public class A333421 extends FilterSequence {

  /** Construct the sequence. */
  public A333421() {
    super(1, new A046807(), v -> Predicates.PRIME.is(v));
  }
}
