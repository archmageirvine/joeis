package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A085875 Rearrangement of natural numbers as follows: a(1) = 1, a(2) =2, a(n+1) = smallest number not included earlier such that a(n-1)*a(n) + a(n+1) is a prime.
 * @author Sean A. Irvine
 */
public class A085875 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 3;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (mB.multiply(mA).add(k).isProbablePrime()) {
        mA = mB;
        mUsed.set(k);
        mB = Z.valueOf(k);
        return mB;
      }
      do {
        ++k;
      } while (mUsed.isSet(k));
    }
  }
}
