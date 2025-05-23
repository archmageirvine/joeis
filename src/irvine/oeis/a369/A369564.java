package irvine.oeis.a369;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a004.A004614;

/**
 * A369564 Powerful numbers whose prime factors are all of the form 4*k + 3.
 * @author Georg Fischer
 */
public class A369564 extends FilterSequence {

  /** Construct the sequence. */
  public A369564() {
    super(1, new A004614(), v -> Predicates.POWERFUL.is(v));
  }
}
