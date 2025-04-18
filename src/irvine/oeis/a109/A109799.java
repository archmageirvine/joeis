package irvine.oeis.a109;
// Generated by gen_seq4.pl 2025-03-26.ack/filter at 2025-03-26 22:40

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A109799 Primes p such that 2^p - 1 is a Chen prime.
 * @author Georg Fischer
 */
public class A109799 extends FilterSequence {

  /** Construct the sequence. */
  public A109799() {
    super(1, new A000040(), p -> Predicates.CHEN_PRIME.is(Z.TWO.pow(p).subtract(1)));
  }
}
