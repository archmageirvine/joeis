package irvine.oeis.a342;
// Generated by gen_seq4.pl 2025-06-16.ack/sintrif at 2025-06-16 21:55

import irvine.math.q.Q;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A342283 a(n) = A342282(n)/2.
 * @author Georg Fischer
 */
public class A342283 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A342283() {
    super(0, (term, n) -> new Q(term).divide(2).num(), "", new A342282());
  }
}
