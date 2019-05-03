package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A005132 Recam&#225;n's sequence (or Recaman's <code>sequence): a(0) = 0</code>; for <code>n &gt; 0, a(n) = a(n-1) - n</code> if positive and not already in the sequence, otherwise <code>a(n) = a(n-1) +</code> n.
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

