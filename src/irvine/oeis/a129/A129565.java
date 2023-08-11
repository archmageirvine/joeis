package irvine.oeis.a129;

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A129565 A115359 * A000012 as infinite lower triangular matrices.
 * @author Georg Fischer
 */
public class A129565 extends LambdaTriangle {

  /** Construct the sequence. */
  public A129565() {
    super(1, 1, 1, (n, k) -> (((n & 1) == 1) ? Z.ONE : ((k <= n / 2) ? Z.ZERO : Z.ONE)));
  }
}
