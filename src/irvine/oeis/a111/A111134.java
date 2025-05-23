package irvine.oeis.a111;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a033.A033950;

/**
 * A111134 Numbers of the form p^(p^k-1) (p prime, k&gt;=0).
 * @author Georg Fischer
 */
public class A111134 extends FilterSequence {

  /** Construct the sequence. */
  public A111134() {
    super(1, new A033950(), v -> v.isOne() || Predicates.PRIME_POWER.is(v));
  }
}
