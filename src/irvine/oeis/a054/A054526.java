package irvine.oeis.a054;
// manually 2024-07-11

import irvine.math.function.Functions;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A054526 Triangle T(n,k): T(n,k) = phi(k) (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A054526 extends LambdaTriangle {

  /** Construct the sequence. */
  public A054526() {
    super(1, 1, 1, (n, k) -> Functions.PHI.z(k));
  }

}
