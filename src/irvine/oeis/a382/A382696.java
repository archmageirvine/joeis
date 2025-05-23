package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005891;

/**
 * A382696 Centered pentagonal numbers that are abundant.
 * @author Georg Fischer
 */
public class A382696 extends FilterSequence {

  /** Construct the sequence. */
  public A382696() {
    super(1, new A005891(), v -> Predicates.ABUNDANT.is(v));
  }
}
