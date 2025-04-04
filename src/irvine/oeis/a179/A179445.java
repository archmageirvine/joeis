package irvine.oeis.a179;
// Generated by gen_seq4.pl 2025-03-31.ack/filter at 2025-03-31 23:38

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a018.A018252;

/**
 * A179445 Nonprimes m such that 10m + 1 are primes.
 * @author Georg Fischer
 */
public class A179445 extends FilterSequence {

  /** Construct the sequence. */
  public A179445() {
    super(1, new A018252(), v -> Predicates.PRIME.is(v.multiply(10).add(1)));
  }
}
