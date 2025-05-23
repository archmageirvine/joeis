package irvine.oeis.a322;
// Generated by gen_seq4.pl 2025-05-11.ack/arrlamb at 2025-05-11 22:56

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.triangle.LambdaArray;

/**
 * A322266 Square array A(n,k), n &gt;= 1, k &gt;= 0, read by antidiagonals: A(n,k) = denominator of Sum_{j=1..n} 1/j^k.
 * @author Georg Fischer
 */
public class A322266 extends LambdaArray {

  /** Construct the sequence. */
  public A322266() {
    super(1, 1, 1, -1, (n, k) -> Rationals.SINGLETON.sum(1, n, j -> new Q(1).divide(j).pow(k - 1)).den());
  }
}
