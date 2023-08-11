package irvine.oeis.a349;
// manually robots/partsum at 2023-08-09

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A349740 Number of partitions of set [n] in a set of &lt;= k noncrossing subsets. Number of Dyck n-paths with at most k peaks. Both with 0 &lt;= k &lt;= n, read by rows.
 * @author Georg Fischer
 */
public class A349740 extends LambdaTriangle {

  /** Construct the sequence. */
  public A349740() {
    // T(n,k) = (1/n)*Sum_{j=0..k} j*binomial(n,j)^2 / (n-j+1) for n >= 1.
    super(0, 0, 0, (n, k) -> (n == 0) ? Z.ONE : Integers.SINGLETON.sum(0, k, j -> Binomial.binomial(n, j).square().multiply(j).divide(n - j + 1)).divide(n));
  }
}
