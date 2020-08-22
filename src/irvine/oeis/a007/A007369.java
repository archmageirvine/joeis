package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A007369 Numbers n such that sigma(x) = n has no solution.
 * @author Sean A. Irvine
 */
public class A007369 implements Sequence {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mS = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mN >= mS || mN >= mA.length()) {
        final long sigma = Cheetah.factor(++mS).sigma().longValueExact();
        mA.set(sigma);
      }
      if (!mA.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
