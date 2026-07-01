package irvine.oeis.a085;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A085612 Triangle in which the n-th row contains n numbers (beginning with the smallest unused value) that have the same prime signature as the first entry on that row.
 * @author Sean A. Irvine
 */
public class A085612 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mSig;
  private long mLeastUnused = 1;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mSig = FactorUtils.leastPrimeSignature(mLeastUnused);
      mUsed.set(mLeastUnused);
      return Z.valueOf(mLeastUnused);
    }
    long k = mLeastUnused;
    while (true) {
      if (FactorUtils.leastPrimeSignature(k).equals(mSig)) {
        mUsed.set(k);
        return Z.valueOf(k);
      }
      do {
        ++k;
      } while (mUsed.isSet(k));
    }
  }
}
