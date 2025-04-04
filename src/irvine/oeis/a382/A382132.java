package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-03-28.ack/filter at 2025-03-28 22:47

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005891;

/**
 * A382132 Centered pentagonal numbers which are semiprimes.
 * @author Georg Fischer
 */
public class A382132 extends FilterSequence {

  /** Construct the sequence. */
  public A382132() {
    super(1, new A005891(), v -> Predicates.SEMIPRIME.is(v));
  }
}
