package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A393394 Number of separable derangements on [n].
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
        ++mRow[k];
        break;
      }
    }
    return 0;
  }

  /*
  def avoids1324(p):

    return not any(p[i]<p[k]<p[j]<p[l] for i, j, k, l in combinations(range(len(p)), 4))
   */

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos < 4) {
      return true;
    }
    final int l = pos - 1;
    // p[i] < p[k] < p[j] < p[l]
    for (int k = 2; k < l; ++k) {
      for (int j = 1; j < k; ++j) {
        for (int i = 0; i < j; ++i) {
          if (p[i] < p[k] && p[k] < p[j] && p[j] < p[l]) {
            return false;
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
