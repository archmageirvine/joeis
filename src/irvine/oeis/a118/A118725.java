package irvine.oeis.a118;
// Generated by gen_seq4.pl 2025-03-26.ack/filter at 2025-03-26 22:40

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a109.A109611;

/**
 * A118725 Chen primes for which the reversal is also a Chen prime.
 * @author Georg Fischer
 */
public class A118725 extends FilterSequence {

  /** Construct the sequence. */
  public A118725() {
    super(1, new A109611(), p -> Predicates.CHEN_PRIME.is(Functions.REVERSE.z(p)));
  }
}
