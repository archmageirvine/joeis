package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-14/trilambn at 2024-06-14 23:07

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A373547 Triangle read by rows: T(n,k) = 4^k*binomial(n+k, n-k) with 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A373547 extends LambdaTriangle {

  /** Construct the sequence. */
  public A373547() {
    super(0, 0, 0, (n, k) -> Z.FOUR.pow(k).multiply(Binomial.binomial(n + k, n - k)));
  }
}
