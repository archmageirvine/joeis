package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008057 Smallest sum of an addition chain for 2n+1.
 * @author Sean A. Irvine
 */
public class A008057 extends Sequence0 {

  // Note method of Charles R. Greathouse IV is much faster than this

  private int mN = -1;
  private long mBest = 0;

  private void search(final int n, final int[] chain, final int pos, final int sum) {
    final int min = chain[pos];
    if (min == n) {
      if (sum < mBest) {
        mBest = sum;
        return;
      }
    }
    int ck;
    for (int k = pos; 2 * (ck = chain[k]) > min; --k) {
      if (sum + ck < mBest) {
        int s;
        for (int j = k; (s = ck + chain[j]) > min; --j) {
          if (s <= n) {
            final int s2 = sum + s;
            if (s2 < mBest) {
              chain[pos + 1] = s;
              search(n, chain, pos + 1, s2);
            }
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mBest = Long.MAX_VALUE;
    final int[] chain = new int[mN + 1];
    chain[0] = 0; // sentinel
    chain[1] = 1;
    search(mN, chain, 1, 0);
    return Z.valueOf(mBest);
  }

}

