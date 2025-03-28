package irvine.oeis.a092;
// Generated by gen_seq4.pl 2025-03-23.ack/filter at 2025-03-23 22:08

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a062.A062198;

/**
 * A092190 Semiprimes that are the sum of the first n semiprimes for some n.
 * @author Georg Fischer
 */
public class A092190 extends FilterSequence {

  /** Construct the sequence. */
  public A092190() {
    super(1, new A062198(), v -> Predicates.SEMIPRIME.is(v));
  }
}
