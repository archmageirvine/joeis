package irvine.oeis.a274;
// Generated by gen_seq4.pl 2025-05-24.ack/filter at 2025-05-24 23:04

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A274525 Prime numbers p such that p - 2, p^2 - p - 1, p^2 - p + 1 are prime numbers.
 * @author Georg Fischer
 */
public class A274525 extends FilterSequence {

  /** Construct the sequence. */
  public A274525() {
    super(1, new A000040().skip(3), p -> Predicates.PRIME.is(p.subtract(2)) && Predicates.PRIME.is(p.square().subtract(p).subtract(1)) && Predicates.PRIME.is(p.square().subtract(p).add(1)));
  }
}
