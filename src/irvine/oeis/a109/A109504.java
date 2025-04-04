package irvine.oeis.a109;
// Generated by gen_seq4.pl 2025-03-26.ack/filter at 2025-03-26 22:40

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A109504 Chen primes p such that p + 2 is triangular.
 * @author Georg Fischer
 */
public class A109504 extends FilterSequence {

  /** Construct the sequence. */
  public A109504() {
    super(1, new A109611(), p -> Predicates.TRIANGULAR.is(p.add(2)));
  }
}
