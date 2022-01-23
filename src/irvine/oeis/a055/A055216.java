package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055216 Triangle T(n,k) by rows, n &gt;= 0, 0&lt;=k&lt;=n: T(n,k) = Sum_{i=0..n-k} binomial(n-k,i) *Sum_{j=0..k-i} binomial(i,j).
 * @author Georg Fischer
 */
public class A055216 extends Triangle {

  /** Construct the sequence. */
  public A055216() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    Z sum1 = Z.ZERO;
    for (int i = 0; i <= n - k; ++i) {
      Z sum2 = Z.ZERO;
      for (int j = 0; j <= k - i; ++j) {
        sum2 = sum2.add(Binomial.binomial(i, j));
      }
      sum1 = sum1.add(Binomial.binomial(n - k, i).multiply(sum2));
    }
    return sum1;
  }
}
