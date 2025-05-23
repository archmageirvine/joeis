package irvine.oeis.a153;
// Generated by gen_seq4.pl 2025-04-20.ack/trilambn at 2025-04-20 22:06

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A153273 Triangle read by rows: T(n,k) = Product_{i=0..k-2} (i*n + n - 1).
 * @author Georg Fischer
 */
public class A153273 extends LambdaTriangle {

  /** Construct the sequence. */
  public A153273() {
    super(2, 2, 2, (n, k) -> Integers.SINGLETON.product(0, k - 2, i -> Z.valueOf(n).multiply(i + 1).subtract(1)));
  }
}
