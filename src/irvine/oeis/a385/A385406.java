package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-01.ack/trilambn at 2025-07-01 16:42

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A385406 Triangle read by rows: T(n, k) = n*(n+1)/2 - floor((n-1)/2) - (-1)^k * floor(k/2).
 * @author Georg Fischer
 */
public class A385406 extends LambdaTriangle {

  /** Construct the sequence. */
  public A385406() {
    super(1, 1, 1, (n, k) -> Functions.TRIANGULAR.z(n).subtract((n - 1) / 2).subtract(Z.NEG_ONE.pow(k).multiply(k / 2)));
  }
}
