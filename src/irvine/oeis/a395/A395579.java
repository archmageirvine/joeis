package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395579 Product of the least factors in all factorizations of n, up to permutation of factors, into factors &gt; 1, a(1) = 1 by convention.
 * @author Sean A. Irvine
 */
public class A395579 extends Sequence1 {

  protected long mN = 0;
  private Z mProd = null;

  private void search(final long n, final long d, final long least) {
    if (n == 1) {
      mProd = mProd.multiply(least);
      return;
    }
    if (d <= n) {
      search(1, n, least);
    }
    for (long k = d; k * k <= n; ++k) {
      if (n % k == 0) {
        search(n / k, k, least);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mProd = Z.ONE;
    for (long k = 2; k <= mN; ++k) {
      if (mN % k == 0) {
        search(mN / k, k, k);
      }
    }
    return mProd;
  }
}
