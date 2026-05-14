package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395579 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A395579 extends Sequence1 {

  private long mN = 0;
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
