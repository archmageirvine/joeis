package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A054408 a(n) = smallest positive integer not already in sequence such that the partial sum a(1)+...+a(n) is prime.
 * @author Sean A. Irvine
 */
public class A054408 implements Sequence {

  private final LongDynamicBooleanArray mEvenUsed = new LongDynamicBooleanArray();
  private Z mSum = Z.ZERO;
  private long mLeastUnusedLowerBound = 2;

  @Override
  public Z next() {
    if (Z.TWO.equals(mSum)) {
      // Special case, only odd value in the sequence
      mSum = Z.THREE;
      return Z.ONE;
    }
    while (mEvenUsed.isSet(mLeastUnusedLowerBound / 2)) {
      mLeastUnusedLowerBound += 2;
    }
    long k = mLeastUnusedLowerBound;
    while (true) {
      final Z t = mSum.add(k);
      if (t.isProbablePrime()) {
        mEvenUsed.set(k / 2);
        mSum = t;
        return Z.valueOf(k);
      }
      do {
        k += 2;
      } while (mEvenUsed.isSet(k / 2));
    }
  }
}
