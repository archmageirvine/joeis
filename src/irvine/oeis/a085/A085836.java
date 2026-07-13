package irvine.oeis.a085;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A085836 Final terms of rows of A085612.
 * @author Sean A. Irvine
 */
public class A085836 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mSig;
  private long mLeastUnused = 1;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      while (mUsed.isSet(mLeastUnused)) {
        ++mLeastUnused;
      }
      if (++mM >= mN) {
        ++mN;
        mM = 0;
        mSig = FactorUtils.leastPrimeSignature(mLeastUnused);
        mUsed.set(mLeastUnused);
        if (mN == 1) {
          return Z.ONE;
        }
        continue;
      }
      long k = mLeastUnused;
      while (true) {
        if (FactorUtils.leastPrimeSignature(k).equals(mSig)) {
          mUsed.set(k);
          if (mM == mN - 1) {
            return Z.valueOf(k);
          }
          break;
        }
        do {
          ++k;
        } while (mUsed.isSet(k));
      }
    }
  }
}
