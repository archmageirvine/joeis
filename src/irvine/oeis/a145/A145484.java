package irvine.oeis.a145;
// Generated by gen_seq4.pl 2025-06-03.ack/filter at 2025-06-03 20:14

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A145484 Primes p such that 2*p - 29 is a positive prime.
 * @author Georg Fischer
 */
public class A145484 extends FilterSequence {

  /** Construct the sequence. */
  public A145484() {
    super(1, new A000040().skip(6), p -> Predicates.PRIME.is(p.multiply(2).subtract(29)));
  }
}
