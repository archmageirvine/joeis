package irvine.oeis.a054;
// manually 2024-07-11

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A054531 Triangular array T read by rows: T(n,k) = n/gcd(n,k) (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A054531 extends LambdaTriangle {

  /** Construct the sequence. */
  public A054531() {
    super(1, 1, 1, (n, k) -> Z.valueOf(n / Functions.GCD.i(n, k)));
  }

}
