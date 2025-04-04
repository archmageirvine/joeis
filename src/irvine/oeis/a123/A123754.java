package irvine.oeis.a123;
// Generated by gen_seq4.pl 2025-03-23.ack/filter at 2025-03-23 22:08

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000466;

/**
 * A123754 Positive numbers of the form 4*n^2 - 1 which are not semiprimes.
 * @author Georg Fischer
 */
public class A123754 extends FilterSequence {

  /** Construct the sequence. */
  public A123754() {
    super(1, new A000466().skip(1), v -> !Predicates.SEMIPRIME.is(v));
  }
}
