package irvine.oeis.a095;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a035.A035336;

/**
 * A095087 Fib010 primes, i.e., primes p whose Zeckendorf-expansion A014417(p) ends with zero, one and zero.
 * @author Georg Fischer
 */
public class A095087 extends FilterSequence {

  /** Construct the sequence. */
  public A095087() {
    super(1, new A035336().skip(1), v -> Predicates.PRIME.is(v));
  }
}
