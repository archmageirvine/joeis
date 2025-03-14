package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-11-05.ack/trilambn at 2024-11-05 20:37

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A228146 Triangle T(n,k), read by rows: T(n,k) is the numerator of (1+2^(n-k+1))/(1-2^(k+1)).
 * @author Georg Fischer
 */
public class A228146 extends LambdaTriangle {

  /** Construct the sequence. */
  public A228146() {
    super(0, 0, 0, (n, k) -> new Q(Z.TWO.pow(n - k + 1).add(1), Z.ONE.subtract(Z.TWO.pow(k + 1))).num());
  }
}
