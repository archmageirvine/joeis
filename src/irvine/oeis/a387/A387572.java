package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A387572 a(n) is the length of the disturbed prefix after n steps of the iterative process defined in the Comments.
 * @author Sean A. Irvine
 */
public class A387572 extends Sequence0 {

  private final LongDynamicLongArray mS = new LongDynamicLongArray();
  private boolean mFirst = true;

  private long s(final long n) {
    if (n >= mS.length()) {
      return n;
    }
    return mS.get(n);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    final long len = s(1);
    for (long k = 1; k <= len; ++k) {
      // swap blocks
      final long t = s(k + len);
      mS.set(k + len, s(k));
      mS.set(k, t);
    }
    long m = mS.length();
    while (s(m) == m) {
      --m;
    }
    return Z.valueOf(m);
  }
}

