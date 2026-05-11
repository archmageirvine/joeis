package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A395725 allocated for Charles Cornell Norton.
 * @author Sean A. Irvine
 */
public class A395725 extends ParallelPermutationSequence {

  private long[] mRow = new long[0];
  private int mM = 0;

  /** Construct the sequence. */
  public A395725() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      if (p[k] == p.length - 1) {
        synchronized (A395725.this) {
          ++mRow[k];
        }
        break;
      }
    }
    return 0;
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos < 3) {
      return true;
    }
    final int l = pos - 1;
    // test for i<j<k<l with p[i] < p[k] < p[j] < p[l]
    for (int k = 2; k < l; ++k) {
      if (p[k] < p[l]) {
        for (int j = 1; j < k; ++j) {
          if (p[j] < p[l] && p[k] < p[j]) {
            for (int i = 0; i < j; ++i) {
              if (p[i] < p[k]) {
                return false;
              }
            }
          }
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = new long[mN + 1];
      super.next(); // trigger the parallel search
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
