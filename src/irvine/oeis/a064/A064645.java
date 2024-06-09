package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064645 Table where the entry (n,k) (n &gt;= 0, k &gt;= 0) gives number of Motzkin paths of the length n with the minimum peak width of k.
 * @author Sean A. Irvine
 */
public class A064645 extends Sequence0 {

  private int mN = -1;

  private Z c(final int n, final int k) {
    return n < 0 ? Z.ZERO : Binomial.binomial(n, k);
  }

  private Z t(final long n, final long k) {
    return Binomial.binomial(n - 1, k - 1).multiply(Binomial.binomial(n, k - 1)).divide(k);
  }

  private Z mpw(final int n, final int m) {
    Z sum = Z.ONE;
    for (int i = 0; i <= n / 2; ++i) {
      for (int k = 1; k <= i; ++k) {
        sum = sum.add(t(i, k).multiply(c(n - m * k, 2 * i)));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    final int t = Functions.TRINV.i(++mN) + 1;
    return mpw((t - 1) * (t + 2) / 2 - mN, mN - t * (t - 1) / 2);
  }
}
