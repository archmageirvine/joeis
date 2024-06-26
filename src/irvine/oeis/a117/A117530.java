package irvine.oeis.a117;
// Generated by gen_seq4.pl 2024-04-01/trilambn at 2024-04-01 22:42

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A117530 Triangle read by rows: T(n,k) = k^2 - k + prime(n), 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A117530 extends LambdaTriangle {

  /** Construct the sequence. */
  public A117530() {
    super(1, 1, 1, (n, k) -> Z.valueOf(k).multiply(k).subtract(k).add(Functions.PRIME.l(n)));
  }
}
