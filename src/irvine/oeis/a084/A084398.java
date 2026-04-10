package irvine.oeis.a084;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A084398 Except for a(1) = 1, rearrangement of natural numbers such that a(n) is not equal to n, but the prime signature of a(n) is the same as that of n.
 * @author Sean A. Irvine
 */
public class A084398 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    final Z sig = FactorUtils.leastPrimeSignature(mN);
    long k = mLeastUnused;
    while (true) {
      if (k != mN && !mUsed.isSet(k) && FactorUtils.leastPrimeSignature(k).equals(sig)) {
        mUsed.set(k);
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
