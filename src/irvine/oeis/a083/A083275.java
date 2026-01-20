package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083275 a(n) = smallest number not occurring earlier such that a(1)*a(2)*...*a(n) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A083275 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 1;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k)) {
        final Z t = mProd.multiply(k);
        if (t.subtract(1).isProbablePrime()) {
          mUsed.set(k);
          mProd = t;
          return Z.valueOf(k);
        }
      }
      ++k;
    }
  }
}

