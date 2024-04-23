package irvine.oeis.a203;
// manually prodsi2 at 2021-11-25

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A203521 a(n) = Product_{1 &lt;= i &lt; j &lt;= n} (prime(i) + prime(j)).
 * @author Georg Fischer
 */
public class A203521 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(Functions.PRIME.l(k) + Functions.PRIME.l(j));
      }
    }
    return prod;
  }
}
