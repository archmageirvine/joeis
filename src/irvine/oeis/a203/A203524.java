package irvine.oeis.a203;
// manually prodsi2 at 2021-11-25

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A203524 a(n) = Product_{2 &lt;= i &lt; j &lt;= n+1} (prime(i) + prime(j)).
 * @author Georg Fischer
 */
public class A203524 extends Sequence1 {

  protected int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 2; j <= k - 1; ++j) {
        prod = prod.multiply(Functions.PRIME.l(k) + Functions.PRIME.l(j));
      }
    }
    return prod;
  }
}
