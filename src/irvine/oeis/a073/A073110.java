package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072950.
 * @author Sean A. Irvine
 */
public class A073110 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;

  private void search(final int remaining, final long used, final long sum) {
    if (remaining == 0) {
      if (sum == 0) {
        ++mCount;
      }
      return;
    }
    // Consider possible elements for position mN - remaining
    for (int k = 0; k < mN; ++k) {
      if ((used & (1L << k)) == 0) {
        // We have not yet used element k
        final long sigma = Functions.SIGMA1.l(k + 1 + remaining);
        if (sigma <= sum) {
          search(remaining - 1, used | (1L << k), sum - sigma);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    mCount = 0;
    search(mN, 0L, 2L * mN * mN);
    return Z.valueOf(mCount);
  }
}

