package irvine.oeis.a054;
// manually 2024-07-11

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A054521 Triangle read by rows: T(n,k) = 1 if gcd(n, k) = 1, T(n,k) = 0 otherwise (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A054521 extends LambdaTriangle {

  /** Construct the sequence. */
  public A054521() {
    super(1, 1, 1, (n, k) -> (Functions.GCD.i(n, k) == 1) ? Z.ONE : Z.ZERO);
  }

}
