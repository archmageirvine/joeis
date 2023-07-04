package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064388 Variation (3) on Recam\u00e1n's sequence (A005132): set s (the step size) initially equal to 2; to get a(n), we first try to subtract s from a(n-1): a(n) = a(n-1)-s if positive and not already in the sequence, in which case we change s to s+1; if not, a(n) = a(n-1)+s+i, where i &gt;= 0 is the smallest number such that a(n-1)+s+i has not already appeared and now we change s to s+i+1.
 * @author Sean A. Irvine
 */
public class A064388 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mValue = 0;
  private long mN = 2;

  @Override
  public Z next() {
    if (mValue == 0) {
      mValue = 1;
    } else {
      final long t = mValue - mN;
      if (t > 0 && !mSeen.isSet(t)) {
        mValue = t;
      } else {
        mValue += mN;
        while (mSeen.isSet(mValue)) {
          ++mValue;
          ++mN;
        }
      }
      ++mN;
    }
    mSeen.set(mValue);
    return Z.valueOf(mValue);
  }
}

