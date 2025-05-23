package irvine.oeis.a342;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a048.A048448;

/**
 * A342993 Numbers of the form prime(i-1)+prime(i+1) that are the average of a twin prime pair.
 * @author Georg Fischer
 */
public class A342993 extends FilterSequence {

  /** Construct the sequence. */
  public A342993() {
    super(1, new A048448(), v -> Predicates.PRIME.is(v.add(1)) && Predicates.PRIME.is(v.subtract(1)));
  }
}
