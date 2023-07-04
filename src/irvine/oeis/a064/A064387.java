package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064387 Variation (2) on Recam\u00e1n's sequence (A005132): to get a(n), we first try to subtract n from a(n-1): a(n) = a(n-1)-n if positive and not already in the sequence; if not then a(n) = a(n-1)+n+i, where i &gt;= 0 is the smallest number such that a(n-1)+n+i has not already appeared.
 * @author Sean A. Irvine
 */
public class A064387 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mValue = 0;
  private long mN = 0;

  @Override
  public Z next() {
    final long t = mValue - ++mN;
    if (t > 0 && !mSeen.isSet(t)) {
      mValue = t;
    } else {
      mValue += mN;
      while (mSeen.isSet(mValue)) {
        ++mValue;
      }
    }
    mSeen.set(mValue);
    return Z.valueOf(mValue);
  }
}

