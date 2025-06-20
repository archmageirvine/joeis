package irvine.oeis.a179;
// Generated by gen_seq4.pl 2025-06-16.ack/sintrif at 2025-06-16 21:55

import irvine.math.q.Q;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A179019 a(n) = (A179017(n)+1)/2.
 * @author Georg Fischer
 */
public class A179019 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A179019() {
    super(1, (term, n) -> (new Q(term).add(1)).divide(2).num(), "", new A179017());
  }
}
