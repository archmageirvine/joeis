package irvine.oeis.a144;
// manually robots/triprod at 2023-08-09 22:01

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A144680 Triangle read by rows, lower half of an array formed by A004736 * A144328 (transform).
 * @author Georg Fischer
 */
public class A144680 extends LambdaTriangle {

  /** Construct the sequence. */
  public A144680() {
    super(1, 1, 1, (n, k) -> Z.valueOf((3 * (k * k - k + 2) * n - k * (k - 1) * (2 * k - 1)) / 6));
  }
}
