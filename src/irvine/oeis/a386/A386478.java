package irvine.oeis.a386;
// manually 2025-07-25/arrlamb at 2025-07-25 19:09

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaArray;

/**
 * A386478 allocated for N. J. A. Sloane.
 * @author Georg Fischer
 */
public class A386478 extends LambdaArray {

  /** Construct the sequence. */
  public A386478() {
    super(1, 0, 1, -1, (n, k) -> Z.valueOf(k * n).square().subtract(Z.valueOf(3 * k - 4).multiply(n)).divide(2).add(1));
    next();
  }
}
