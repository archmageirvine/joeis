package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-22/lambdan at 2024-05-22 22:35

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A372836 a(n) is the numerator of Sum_{d|n, 1 &lt; d &lt; n} 1/d.
 * @author Georg Fischer
 */
public class A372836 extends LambdaSequence {

  /** Construct the sequence. */
  public A372836() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> 1 < d && d < n ? new Q(1, d) : Q.ZERO).num());
  }
}
