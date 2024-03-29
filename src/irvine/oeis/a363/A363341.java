package irvine.oeis.a363;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A363341 Number of positive integers k &lt;= n such that round(n/k) is odd.
 * @author Georg Fischer
 */
public class A363341 extends LambdaSequence {

  /** Construct the sequence. */
  public A363341() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> new Q(n, k).round().modZ(2)));
  }
}
