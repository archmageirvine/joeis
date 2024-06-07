package irvine.oeis.a070;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070263 Triangle T(n,k), n&gt;=0, 1 &lt;= k &lt;= 2^n, read by rows, giving minimal distance-sum of any set of k binary vectors of length n.
 * @author Sean A. Irvine
 */
public class A070263 extends Sequence0 {

  // Brute force

  private int mLim = 1;
  private int mM = 0;
  private long[] mVectors = new long[1];
  private int[] mMinDistance = new int[2];

  private void search(final int n, final int distance, final long v) {
    final int d = mMinDistance[n];
    if (distance < d) {
      mMinDistance[n] = distance;
    }
    if (v < mLim) {
      search(n, distance, v + 1); // do not include v
      // include v
      int f = distance;
      for (int k = 0; k < n; ++k) {
        f += Long.bitCount(mVectors[k] ^ v);
      }
      mVectors[n] = v;
      search(n + 1, f, v + 1);
    }
  }

  @Override
  public Z next() {
    if (++mM > mLim) {
      mM = 1;
      mLim <<= 1;
      mVectors = new long[mLim];
      mMinDistance = new int[mLim + 1];
      Arrays.fill(mMinDistance, Integer.MAX_VALUE);
      search(0, 0, 0);
    }
    return Z.valueOf(mMinDistance[mM]);
  }
}
