package irvine.oeis.a030;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A030311.
 * @author Sean A. Irvine
 */
public class A030311 extends A030308 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mM = -1;
  private long mN = 0;

  private boolean isSet(final long n) {
    while (n > mM) {
      ++mM;
      if (Z.ONE.equals(super.next())) {
        mA.set(mM);
      }
    }
    return mA.isSet(n);
  }

  private boolean isMatch(long n, final long pos, final long len) {
    for (long k = len - 1; k >= 0; --k) {
      if (isSet(pos + k) != ((n & 1) == 1)) {
        return false;
      }
      n >>>= 1;
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      final long len = LongUtils.lg(mN) + 1;
      if (isMatch(mN, ++k, len)) {
        return Z.valueOf(k);
      }
    }
  }
}

