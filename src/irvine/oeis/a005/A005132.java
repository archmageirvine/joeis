package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A005132.
 * @author Sean A. Irvine
 */
public class A005132 implements Sequence {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mPrev = 0;
  private long mN = -1;

  @Override
  public Z next() {
    final long t = mPrev - ++mN;
    final long u = t > 0 && !mSeen.isSet(t) ? t : mPrev + mN;
    mSeen.set(u);
    mPrev = u;
    return Z.valueOf(u);
  }
}

