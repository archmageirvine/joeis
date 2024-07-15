package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A055314 Triangle T(n,k) read by rows: number of labeled trees with n nodes and k leaves, n &gt;= 2, 2 &lt;= k &lt;= n.
 * T(n, k) = (n!/k!)*Stirling2(n-2, n-k).
 * @author Georg Fischer
 */
public class A055314 extends LambdaTriangle {

  /** Construct the sequence. */
  public A055314() {
    super(2, 2, 2, (n, k) -> Functions.FALLING_FACTORIAL.z(n, n - k).multiply(Functions.STIRLING2.z(n - 2, n - k)));
  }

}
