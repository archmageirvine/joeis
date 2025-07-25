package irvine.oeis.a231;
// Generated by gen_seq4.pl 2025-07-17.ack/rambdan at 2025-07-18 00:03

import irvine.math.q.Q;
import irvine.oeis.RationalLambdaSequence;

/**
 * A231190 Numerator of abs(n-8)/(2*n), n &gt;= 1.
 * @author Georg Fischer
 */
public class A231190 extends RationalLambdaSequence {

  /** Construct the sequence. */
  public A231190() {
    super(1, NUM, n -> new Q(n - 8, 2 * n).abs());
  }
}
