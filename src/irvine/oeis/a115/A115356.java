package irvine.oeis.a115;
// manually 2023-10-17

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A115356 Matrix (1,x)+(x,x^2) in Riordan array notation.
 * @author Georg Fischer
 */
public class A115356 extends LambdaTriangle {

  /** Construct the sequence. */
  public A115356() {
    super(0, 0, 0, (n, k) -> (n == k || n == 2 * k + 1) ? Z.ONE : Z.ZERO);
  }
}

