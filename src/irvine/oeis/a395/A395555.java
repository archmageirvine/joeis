package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A395555 a(n) = n for n&lt;=3, then a(n) = smallest number not already used which shares a factor with a(n-1) or a(n-2) or a(n-3).
 * @author Sean A. Irvine
 */
public class A395555 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 4;

  @Override
  public Z next() {
    if (mC == null) {
      if (mB == null) {
        if (mA == null) {
          mA = Z.ONE;
          return Z.ONE;
        }
        mB = Z.TWO;
        return Z.TWO;
      }
      mC = Z.THREE;
      return Z.THREE;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k) && (Functions.GCD.l(mA, k) > 1 || Functions.GCD.l(mB, k) > 1 || Functions.GCD.l(mC, k) > 1)) {
        mUsed.set(k);
        mA = mB;
        mB = mC;
        mC = Z.valueOf(k);
        return mC;
      }
      ++k;
    }
  }
}
