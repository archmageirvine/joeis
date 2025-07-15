package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A078759 Height of n-th term in A064389 (variation (4) of Recam\u00e1n's sequence).
 * @author Sean A. Irvine
 */
public class A078759 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mValue = 0;
  private long mN = 0;
  private long mH = 0;

  @Override
  public Z next() {
    long k = ++mN;
    while (true) {
      final long t = mValue - k;
      if (t > 0 && !mSeen.isSet(t)) {
        mValue = t;
        --mH;
        break;
      }
      final long u = mValue + k;
      if (!mSeen.isSet(u)) {
        mValue = u;
        ++mH;
        break;
      }
      ++k;
    }
    mSeen.set(mValue);
    return Z.valueOf(mH);
  }
}

