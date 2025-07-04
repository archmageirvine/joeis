package irvine.oeis.a081;
// Generated by gen_seq4.pl 2025-06-16.ack/filter at 2025-06-16 21:55

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A081092 Primes having a prime number of 1's in their binary representation.
 * @author Georg Fischer
 */
public class A081092 extends FilterSequence {

  /** Construct the sequence. */
  public A081092() {
    super(1, new A000040(), v -> Predicates.PRIME.is(Functions.DIGIT_SUM.z(2, v)));
  }
}
