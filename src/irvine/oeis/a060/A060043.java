package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a003.A003056;

/**
 * A060043 Triangle T(n,k), n &gt;= 1, k &gt;= 1, of generalized sum of divisors function, read by rows.
 * @author Sean A. Irvine
 */
public class A060043 extends A003056 {

  private int mN = 0;
  private int mM = super.next().intValueExact() + 1;
  private Z mSum = null;

  private void search(final int remaining, final int remainingParts, final Z prod, final int m) {
    if (remainingParts == 0) {
      if (remaining == 0) {
        mSum = mSum.add(prod);
      }
      return;
    }
    for (int k = m + 1; k <= remaining; ++k) {
      for (int s = 1; s * k <= remaining; ++s) {
        search(remaining - s * k, remainingParts - 1, prod.multiply(s), k);
      }
    }
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      ++mN;
      mM = super.next().intValueExact();
    }
    if (mM == 1) {
      return Jaguar.factor(mN).sigma();
    }
    mSum = Z.ZERO;
    search(mN, mM, Z.ONE, 0);
    return mSum;
  }
}
