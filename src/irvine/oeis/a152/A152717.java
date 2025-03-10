package irvine.oeis.a152;
// Generated by gen_seq4.pl 2024-10-20.ack/trilambn at 2024-10-20 00:12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A152717 Triangle T(n,k) read by rows: T(n,k) = 5^min(k, n-k) = 5^A004197(n,k).
 * @author Georg Fischer
 */
public class A152717 extends LambdaTriangle {

  /** Construct the sequence. */
  public A152717() {
    super(0, 0, 0, (n, k) -> Z.FIVE.pow(Functions.MIN.z(k, n - k)));
  }
}
