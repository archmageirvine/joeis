package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A393470 Triangle read by rows: T(n, k) is the number of ordered pairs (i, j) of integers with 0 &lt;= i, j &lt; n such that floor((i*j) / n) = k.
 * @author Sean A. Irvine
 */
public class A393470 extends Sequence2 {

  private int mN = 1;
  private int mM = 0;
  private long[] mCounts = {};

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      mCounts = new long[mN++];
      mM = 0;
      for (long j = 0; j < mN; ++j) {
        for (long k = 0; k < mN; ++k) {
          ++mCounts[(int) (j * k / mN)];
        }
      }
    }
    return Z.valueOf(mCounts[mM]);
  }
}
