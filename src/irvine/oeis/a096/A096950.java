package irvine.oeis.a096;
// Generated by gen_seq4.pl 2025-06-12.ack/lambdan at 2025-06-12 21:49

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A096950 Denominators of partial sums of series for 3*arctanh(1/3) = (3/2)*log(2).
 * @author Georg Fischer
 */
public class A096950 extends LambdaSequence {

  /** Construct the sequence. */
  public A096950() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(1, 3).pow(2 * k).divide(2 * k + 1)).den());
  }
}
