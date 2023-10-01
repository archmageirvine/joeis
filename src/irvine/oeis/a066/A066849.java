package irvine.oeis.a066;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A066849 Consider sequence of fractions A066657/A066658 produced by ratios of terms in A066720; let m = smallest integer such that all fractions 1/n, 2/n, ..., (n-1)/n have appeared when we reach A066720(m) = k; sequence gives values of m; set a(n) = -1 if some fraction i/n never appears.
 * @author Sean A. Irvine
 */
public class A066849 extends A066657 {

  private static final int MAX_DEN = 1000;
  private final boolean[][] mMarks = new boolean[MAX_DEN][];
  private final int[] mCounts = new int[MAX_DEN];
  private final long[] mLast = new long[MAX_DEN];
  private int mR = 0;
  {
    setOffset(1);
    for (int k = 0; k < mMarks.length; ++k) {
      mMarks[k] = new boolean[k + 1];
    }
  }

  @Override
  protected Z select(final Q q) {
    if (q.den().bitCount() <= 31) {
      final int d = q.den().intValueExact();
      if (d < MAX_DEN) {
        final int n = q.num().intValueExact();
        // Deal with 1/2 = 2/4 = 3/6 = ... etc.
        for (int dd = d, nn = n; dd < MAX_DEN; dd += d, nn += n) {
          if (!mMarks[dd][nn]) {
            ++mCounts[dd];
            mLast[dd] = mN + 1;
            mMarks[dd][nn] = true;
          }
        }
      }
    }
    return null; // return value is ignored
  }

  @Override
  public Z next() {
    if (++mR >= MAX_DEN) {
      throw new UnsupportedOperationException();
    }
    while (mCounts[mR] < mR) {
      super.next();
    }
    return Z.valueOf(mLast[mR]);
  }
}
