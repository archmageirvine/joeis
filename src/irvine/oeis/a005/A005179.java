package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A005179 Smallest number with exactly n divisors.
 * @author Sean A. Irvine
 */
public class A005179 implements Sequence {

  private DynamicLongArray mLeast = new DynamicLongArray();
  private long mLastFactored = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mLeast.get(mN) == 0) {
      final int div = Cheetah.factor(++mLastFactored).sigma0().intValueExact();
      if (mLeast.get(div) == 0) {
        mLeast.set(div, mLastFactored);
      }
    }
    return Z.valueOf(mLeast.get(mN));
  }
}
