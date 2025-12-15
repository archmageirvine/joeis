package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A390274 The least k such that each possible decimal digit string of length n occurs in some 2^i for 0 &lt;= i &lt;= k.
 * @author Sean A. Irvine
 */
public class A390274 extends Sequence1 {

  private long mLim = 1;

  @Override
  public Z next() {
    mLim *= 10;
    long k = 0;
    Z powerOf2 = Z.ONE;
    while (powerOf2.compareTo(mLim) < 0) {
      powerOf2 = powerOf2.multiply2();
      ++k;
    }
    long count = 0;
    final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
    while (true) {
      Z t = powerOf2;
      while (t.compareTo(mLim) >= 0) {
        final long r = t.mod(mLim);
        if (!mSeen.isSet(r)) {
          mSeen.set(r);
          if (++count == mLim) {
            return Z.valueOf(k);
          }
        }
        t = t.divide(10);
      }
      powerOf2 = powerOf2.multiply2();
      ++k;
    }
  }
}
