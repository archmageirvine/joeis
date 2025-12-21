package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a336.A336282;

/**
 * A391508 Triangle read by rows: T(n,k) = number of heapable permutations of length n with exactly k-1 213 patterns.
 * @author Sean A. Irvine
 */
public class A391508 extends A336282 {

  private long[] mRow = new long[0];
  private int mM = 0;

  /** Construct the sequence. */
  public A391508() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    final int contrib = contribution(p);
    synchronized (A391508.this) {
      ++mRow[contrib];
    }
    return 0;
  }

  protected int contribution(final int[] p) {
    int cnt = 0;
    for (int k = 0; k < p.length - 2; ++k) {
      for (int j = k + 1; j < p.length - 1; ++j) {
        if (p[k] > p[j]) {
          for (int i = j + 1; i < p.length; ++i) {
            if (p[k] < p[i]) {
              ++cnt;
            }
          }
        }
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length || mRow[mM] == 0) {
      final int n = mN + 2;
      mRow = new long[n * (n * n - 6 * n + 11) / 6];
      super.next(); // trigger the parallel search
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
