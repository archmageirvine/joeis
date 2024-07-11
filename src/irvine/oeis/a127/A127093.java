package irvine.oeis.a127;
// manually 2024-07-11

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A127093 Triangle read by rows: T(n,k)=k if k is a divisor of n; otherwise, T(n,k)=0 (1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A127093 extends LambdaTriangle {

  /** Construct the sequence. */
  public A127093() {
    super(1, 1, 1, (n, k) -> Z.valueOf((n % k == 0) ? k : 0));
  }

}
