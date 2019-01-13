package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A007368.
 * @author Sean A. Irvine
 */
public class A007368 implements Sequence {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = -1;
  private long mS = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      while (k >= mS || k >= mA.length()) {
        final long sigma = Cheetah.factor(++mS).sigma().longValueExact();
        mA.set(sigma, mA.get(sigma) + 1);
      }
      if (mA.get(k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
