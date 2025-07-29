package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A079049 Recam\u00e1n variation: a(1) = 1; for n &gt; 1, a(n) = a(n-1)-prime(n) if that number is positive and not already in the sequence, otherwise a(n) = a(n-1)+prime(n).
 * @author Sean A. Irvine
 */
public class A079049 extends A000040 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mPrev = 0;

  @Override
  public Z next() {
    final long p = super.next().longValue();
    final long u;
    if (p > 2) {
      final long t = mPrev - p;
      u = t > 0 && !mSeen.isSet(t) ? t : mPrev + p;
    } else {
      u = 1;
    }
    mSeen.set(u);
    mPrev = u;
    return Z.valueOf(u);
  }
}

