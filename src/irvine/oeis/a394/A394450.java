package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A000959 Lucky numbers.
 * @author Sean A. Irvine
 */
public class A394450 extends Sequence1 {

  // Cf. A000959.

  protected final LongDynamicLongArray mLucky = new LongDynamicLongArray();
  private long mN = -1;
  private long mG = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      mLucky.set(0, 2L);
    } else if (mN == 1) {
      mLucky.set(1, 3L);
    } else {
      if (mLucky.get(mG + 1) <= mN + 1) {
        ++mG;
      }
      long k = mN;
      for (long i = mG; i > 0; --i) {
        k = k * mLucky.get(i) / (mLucky.get(i) - 1);
      }
      mLucky.set(mN, Functions.PRIME.l(k + 1));
    }
    return Z.valueOf(mLucky.get(mN));
  }
}
