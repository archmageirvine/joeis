package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A383941 a(0) = 0; for n &gt;= 1, a(n) is the smallest positive integer not already in the sequence that is coprime to both a(n-1) and the sum of all preceding terms.
 * @author Sean A. Irvine
 */
public class A383941 extends Sequence0 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 1;
  private Z mA = null;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      while (mUsed.isSet(mLeastUnused)) {
        ++mLeastUnused;
      }
      long k = mLeastUnused;
      while (mUsed.isSet(k) || Functions.GCD.l(mA, k) > 1 || !Functions.GCD.z(mSum, k).isOne()) {
        ++k;
      }
      mUsed.set(k);
      mA = Z.valueOf(k);
      mSum = mSum.add(k);
    }
    return mA;
  }
}
