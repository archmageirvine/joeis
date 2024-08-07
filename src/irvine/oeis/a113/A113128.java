package irvine.oeis.a113;
// Generated by gen_seq4.pl 2023-10-17/trilambn at 2023-10-17 13:08

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A113128 A simple 4-diagonal matrix based on (1+x)^3.
 * @author Georg Fischer
 */
public class A113128 extends LambdaTriangle {

  /** Construct the sequence. */
  public A113128() {
    super(0, 1, 1, (n, k) -> Z.valueOf((n > 3 + k) ? 0 : (long) (new int[]{1, 3, 3, 1})[n - k] * k));
  }
}
