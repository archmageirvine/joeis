package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000196;

/**
 * A060047 Triangle of generalized sum of divisors function, read by rows.
 * @author Sean A. Irvine
 */
public class A060047 extends A000196 {

  private int mN = 0;
  private int mM = super.next().intValueExact() + 1;
  protected Z mSum = null;
  {
    setOffset(1);
  }

  protected void search(final int remaining, final int remainingParts, final Z prod, final int m) {
    if (remainingParts == 0) {
      if (remaining == 0) {
        mSum = mSum.add(prod);
      }
      return;
    }
    for (int k = m + 2; k <= remaining; k += 2) {
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
    mSum = Z.ZERO;
    search(mN, mM, Z.ONE, -1);
    return mSum;
  }
}
