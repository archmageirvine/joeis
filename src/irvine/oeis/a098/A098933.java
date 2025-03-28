package irvine.oeis.a098;
// Generated by gen_seq4.pl 2025-03-28.ack/filter at 2025-03-28 22:47

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A098933 Primes of the form p+14, where p is a prime.
 * @author Georg Fischer
 */
public class A098933 extends FilterSequence {

  /** Construct the sequence. */
  public A098933() {
    super(1, new A000040(), p -> Predicates.PRIME.is(p.subtract(14)));
  }
}
