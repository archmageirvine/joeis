package irvine.oeis.a089;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a063.A063530;

/**
 * A089952 Numbers n such that n+1 and phi(n)+1 are both perfect squares.
 * @author Georg Fischer
 */
public class A089952 extends FilterSequence {

  /** Construct the sequence. */
  public A089952() {
    super(1, new A063530(), v -> Predicates.SQUARE.is(v.add(1)));
  }
}
