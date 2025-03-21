package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076082.
 * @author Sean A. Irvine
 */
public class A076143 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;

  private void search(final int sum, final int pos, final long used) {
    if (pos == mN) {
      ++mCount;
      return;
    }
    long j = 1;
    for (int k = 1; k <= mN; ++k, j <<= 1) {
      if ((used & j) == 0) {
        if (Functions.GCD.i(sum, k) == 1) {
          search(sum + k, pos + 1, used | j);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    for (int k = 1; k <= mN; ++k) {
      search(k, 1, 1L << (k - 1));
    }
    return Z.valueOf(mCount);
  }
}
