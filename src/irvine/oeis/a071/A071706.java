package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071706 Number of complete mappings f(x) of the cyclic group Z_{2n+1} such that -f(-x)=f.
 * @author Sean A. Irvine
 */
public class A071706 extends Sequence0 {

  private int mN = -1;
  private long mCount = 0;
  private int[] mF;

  private void search(final int x, final long used1, final long used2) {
    if (x == mN) {
      ++mCount;
      return;
    }
    for (int k = 1; k < mN; ++k) {
      final long b1 = 1L << k;
      if ((used1 & b1) == 0) { // k is not yet in the permutation
        final long b2 = 1L << ((k + mN - x) % mN);
        if ((used2 & b2) == 0) {
          final long b3 = 1L << (mN - k);
          mF[x] = k;
          if ((used1 & b3) == 0 || mN - mF[mN - x] == k) { // check -f(-x) == f(x) constraint
            search(x + 1, used1 | b1, used2 | b2);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mCount = 0;
    mF = new int[mN];
    search(1, 1L, 1L); // Assume f(0)=0
    return Z.valueOf(mCount);
  }

}
