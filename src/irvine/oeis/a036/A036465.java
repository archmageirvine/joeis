package irvine.oeis.a036;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036465 If n^2 = sum a_i^2, i&gt;1, then a(n) is the maximum value of min(a_i).
 * @author Sean A. Irvine
 */
public class A036465 implements Sequence {

  private int mN = 1;
  private int mLowerBound = 0;

  private void search(final int remaining, final int[] parts, final int partIndex, final int m) {
    if (remaining == 0) {
      // We have constructed a sum mN^2 = sum(parts^2), with each part > mLowerBound.
      mLowerBound = m;
      return;
    }
    if (m > mLowerBound) {
      for (int k = m; k > mLowerBound; --k) {
        final int r = remaining - k * k;
        if (r >= 0) {
          parts[partIndex] = k;
          search(remaining - k * k, parts, partIndex + 1, k);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mLowerBound = Math.max(1, IntegerUtils.sqrt(mN / 2));
    final int s = mN * mN;
    final int[] parts = new int[s];
    search(s, parts, 0, mN - 1);
    return Z.valueOf(mLowerBound);
  }
}
