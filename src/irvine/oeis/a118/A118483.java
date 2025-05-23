package irvine.oeis.a118;
// Generated by gen_seq4.pl 2025-04-22.ack/partsun at 2025-04-22 22:21

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a008.A008578;

/**
 * A118483 Partial sums of primes that are not Chen primes (starting with 1).
 * @author Georg Fischer
 */
public class A118483 extends PartialSumSequence {

  /** Construct the sequence. */
  public A118483() {
    super(0, new FilterSequence(1, new A008578(), p -> !Predicates.CHEN_PRIME.is(p)));
  }
}
