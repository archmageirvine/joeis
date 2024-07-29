package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060315.
 * @author Sean A. Irvine
 */
public class A071608 extends Sequence0 {

  private int mN = -1;
  private long mCount = 0;
  private int[] mF;
  private int[] mInv;

  private boolean is(final int[] f, final int[] inv) {
    for (int k = 0; k < f.length; ++k) {
      if (f[k] != (mN - inv[k]) % mN) {
        return false;
      }
    }
    return true;
  }

  private void search(final int x, final long used1, final long used2) {
    if (x == mN) {
      if (is(mF, mInv)) {
        ++mCount;
      }
      return;
    }
    for (int k = 1; k < mN; ++k) {
      final long b1 = 1L << k;
      if ((used1 & b1) == 0) { // k is not yet in the permutation
        final long b2 = 1L << ((k + mN - x) % mN);
        if ((used2 & b2) == 0) {
          mF[x] = k;
          mInv[(mN - x + k) % mN] = x;
          search(x + 1, used1 | b1, used2 | b2);
        }
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mCount = 0;
    mF = new int[mN];
    mInv = new int[mN];
    search(1, 1L, 1L);
    return Z.valueOf(mCount);
  }

}
