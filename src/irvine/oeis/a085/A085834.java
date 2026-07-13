package irvine.oeis.a085;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A085834 Initial terms of rows in table A085612.
 * @author Sean A. Irvine
 */
public class A085834 extends Sequence1 {

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
        return Z.valueOf(mLeastUnused);
      }
      long k = mLeastUnused;
      while (true) {
        if (FactorUtils.leastPrimeSignature(k).equals(mSig)) {
          mUsed.set(k);
          break;
        }
        do {
          ++k;
        } while (mUsed.isSet(k));
      }
    }
  }
}
