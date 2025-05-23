package irvine.oeis.a175;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a090.A090563;

/**
 * A175063 Primes p such that 5*p^2 + 5*p + 1 is also prime.
 * @author Georg Fischer
 */
public class A175063 extends FilterSequence {

  /** Construct the sequence. */
  public A175063() {
    super(1, new A090563(), v -> Predicates.PRIME.is(v));
  }
}
