package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-24.ack/filter at 2025-05-24 23:04

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A383393 Primes p such that p + 2, p + 8, p + 12, p + 18 and p + 20 are also primes.
 * @author Georg Fischer
 */
public class A383393 extends FilterSequence {

  /** Construct the sequence. */
  public A383393() {
    super(1, new A000040().skip(1), p -> Predicates.PRIME.is(p.add(2)) && Predicates.PRIME.is(p.add(8)) && Predicates.PRIME.is(p.add(12)) && Predicates.PRIME.is(p.add(18)) && Predicates.PRIME.is(p.add(20)));
  }
}
