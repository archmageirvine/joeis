package irvine.oeis.a051;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051287.
 * @author Sean A. Irvine
 */
public class A051287 implements Sequence {

  private final ArrayList<long[][]> mCounts = new ArrayList<>();
  private int mN = -1;
  private int mM = 0;

  protected long p(final int n, final int k, final int c) {
    while (n >= mCounts.size()) {
      final int nn = mCounts.size();
      final long[][] cnts = new long[nn + 1][nn + 1];
      mCounts.add(cnts);
      for (long vec = 0; vec < 1L << nn; ++vec) {
        int cnt = 0;
        for (int j = 0; j < nn; ++j) {
          if (((vec & (1L << j)) == 0) == ((vec & (1L << (nn - j - 1))) == 0)) {
            ++cnt;
          }
        }
        ++cnts[Long.bitCount(vec)][cnt];
      }
    }
    return mCounts.get(n)[k][c];
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(p(mN, mM, Math.abs(mN - 2 * mM)));
  }
}
