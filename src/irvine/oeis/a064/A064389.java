package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064389 Variation (4) on Recam\u00e1n's sequence (A005132): to get a(n), we first try to subtract n from a(n-1): a(n) = a(n-1) - n if positive and not already in the sequence; if not then we try to add n: a(n) = a(n-1) + n if not already in the sequence; if this fails we try to subtract n+1 from a(n-1), or to add n+1 to a(n-1), or to subtract n+2, or to add n+2, etc., until one of these produces a positive number not already in the sequence - this is a(n).
 * @author Sean A. Irvine
 */
public class A064389 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mValue = 0;
  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    while (true) {
      final long t = mValue - k;
      if (t > 0 && !mSeen.isSet(t)) {
        mValue = t;
        break;
      }
      final long u = mValue + k;
      if (!mSeen.isSet(u)) {
          mValue = u;
          break;
      }
      ++k;
    }
    mSeen.set(mValue);
    return Z.valueOf(mValue);
  }
}

