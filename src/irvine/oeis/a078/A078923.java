package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A078923 Possible values of sigma(n)-n.
 * @author Sean A. Irvine
 */
public class A078923 extends Sequence1 {

  private long mN = -1;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  {
    mSeen.set(0);
    mSeen.set(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        for (long k = (mN - 2) * (mN - 2) + 1; k <= (mN - 1) * (mN - 1); ++k) {
          final long index = Jaguar.factor(k).sigma().subtract(k).longValueExact();
          if (index >= 0) {
            mSeen.set(index);
          }
        }
      }
      if (mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

