package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-24.ack/filter at 2025-05-24 23:04

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A383167 Primes p such that p + 4, p + 10, p + 12, p + 18 and p + 22 are also primes.
 * @author Georg Fischer
 */
public class A383167 extends FilterSequence {

  /** Construct the sequence. */
  public A383167() {
    super(1, new A000040().skip(1), p -> Predicates.PRIME.is(p.add(4)) && Predicates.PRIME.is(p.add(10)) && Predicates.PRIME.is(p.add(12)) && Predicates.PRIME.is(p.add(18)) && Predicates.PRIME.is(p.add(22)));
  }
}
