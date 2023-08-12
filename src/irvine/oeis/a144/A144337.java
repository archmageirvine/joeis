package irvine.oeis.a144;
// manually robots/trisum2 at 2023-08-09 22:01

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A144337 Triangle read by rows, A000012 * (2*A144328 - A000012).
 * @author Georg Fischer
 */
public class A144337 extends LambdaTriangle {

  /** Construct the sequence. */
  public A144337() {
    super(1, 1, 1, (n, k) -> {
      if (k <= 2) {
        return Z.valueOf(n + 1 - k);
      }
      final int diag = k * 2 - 3;
      return Z.valueOf((n + 1 - k) * diag);
    });
  }
}
