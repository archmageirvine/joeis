package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a003.A003056;

/**
 * A060044 Triangle of generalized sum of divisors function, read by rows.
 * @author Sean A. Irvine
 */
public class A060044 extends A003056 {

  private int mN = 0;
  private int mM = super.next().intValueExact() + 1;
  protected Z mSum = null;
  {
    setOffset(1);
  }

  protected void search(final int remaining, final int remainingParts, final Z prod, final int sign, final int m) {
    if (remainingParts == 0) {
      if (remaining == 0) {
        mSum = mSum.signedAdd((sign & 1) == 0, prod);
      }
      return;
    }
    for (int k = m + 1; k <= remaining; ++k) {
      for (int s = 1; s * k <= remaining; ++s) {
        search(remaining - s * k, remainingParts - 1, prod.multiply(s), sign + s, k);
      }
    }
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      ++mN;
      mM = super.next().intValueExact();
    }
    mSum = Z.ZERO;
    search(mN, mM, Z.ONE, mM, 0);
    return mSum;
  }
}
