package irvine.oeis.a007;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007770 Happy numbers: numbers whose trajectory under iteration of sum of squares of digits map (see A003132) includes 1.
 * @author Sean A. Irvine
 */
public class A007770 extends Sequence1 {

  private static final int CACHE_BITS = 20;
  private Z mN = Z.ZERO;
  private final long[] mCache = new long[1 << CACHE_BITS]; // Remembers the result for small values
  private final HashSet<Z> mSeen = new HashSet<>();

  private long squareDigitSum(final Z n) {
    if (n.bitLength() < CACHE_BITS) {
      final long r = mCache[n.intValue()];
      if (r != 0) {
        return r;
      }
    }
    long s = 0;
    Z m = n;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(Z.TEN);
      final int r = qr[1].intValue();
      s += (long) r * r;
      m = qr[0];
    }
    if (n.bitLength() < CACHE_BITS) {
      mCache[n.intValue()] = s;
    }
    return s;
  }

  protected boolean isHappy(Z n) {
    mSeen.clear();
    while (true) {
      if (Z.ONE.equals(n)) {
        return true;
      }
      if (!mSeen.add(n)) {
        return false; // cycles
      }
      n = Z.valueOf(squareDigitSum(n));
    }
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isHappy(mN)) {
        return mN;
      }
    }
  }
}
