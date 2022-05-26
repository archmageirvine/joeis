package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A057165 Indices of addition steps in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A057165 implements Sequence {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mPrev = 0;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long t = mPrev - ++mN;
      final boolean add = t > 0 && !mSeen.isSet(t);
      final long u = add ? t : mPrev + mN;
      mSeen.set(u);
      mPrev = u;
      if (!add) {
        return Z.valueOf(mN);
      }
    }
  }
}

