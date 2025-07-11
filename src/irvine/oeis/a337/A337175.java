package irvine.oeis.a337;
// Generated by gen_seq4.pl 2025-06-16.ack/sintrif at 2025-06-16 21:55

import irvine.math.q.Q;
import irvine.oeis.DirectSequence;
import irvine.oeis.a010.A010052;
import irvine.oeis.a035.A035116;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A337175 Number of pairs of divisors of n, (d1,d2), such that d1 &lt;= d2 and d1*d2 &lt; n.
 * @author Georg Fischer
 */
public class A337175 extends SingleTransformSequence {

  private static final DirectSequence A010052 = new A010052();

  /** Construct the sequence. */
  public A337175() {
    super(1, (term, n) -> (new Q(term).subtract(A010052.a(n))).divide(4).num(), "", new A035116());
  }
}
