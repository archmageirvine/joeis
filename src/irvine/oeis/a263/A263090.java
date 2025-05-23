package irvine.oeis.a263;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a236.A236562;

/**
 * A263090 Primes p for which A049820(x) = p has a solution.
 * @author Georg Fischer
 */
public class A263090 extends FilterSequence {

  /** Construct the sequence. */
  public A263090() {
    super(1, new A236562(), v -> Predicates.PRIME.is(v));
  }
}
