package irvine.oeis.a168;
// Generated by gen_seq4.pl 2025-06-03.ack/filter at 2025-06-03 20:14

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A168446 Primes p such that floor(p/5) is also prime.
 * @author Georg Fischer
 */
public class A168446 extends FilterSequence {

  /** Construct the sequence. */
  public A168446() {
    super(1, new A000040(), p -> Predicates.PRIME.is(p.divide(5)));
  }
}
