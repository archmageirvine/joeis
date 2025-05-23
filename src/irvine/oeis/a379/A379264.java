package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000326;

/**
 * A379264 Pentagonal numbers that are abundant.
 * @author Georg Fischer
 */
public class A379264 extends FilterSequence {

  /** Construct the sequence. */
  public A379264() {
    super(1, new A000326().skip(1), v -> Predicates.ABUNDANT.is(v));
  }
}
