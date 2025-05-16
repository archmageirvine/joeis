package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A077341 Triangle in which n-th row contains the first n numbers, not already present, that begin with n.
 * @author Sean A. Irvine
 */
public class A077341 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mM = 0;
  private long mAdd = 0;
  private long mLim = 0;
  private long mA = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mAdd = -1;
      mLim = 10;
      mA = mN * 10;
      if (!mSeen.isSet(mN)) {
        mSeen.set(mN);
        return Z.valueOf(mN);
      }
    }
    while (true) {
      if (++mAdd == mLim) {
        mLim *= 10;
        mA *= 10;
        mAdd = 0;
      }
      final long v = mA + mAdd;
      if (!mSeen.isSet(v)) {
        mSeen.set(v);
        return Z.valueOf(v);
      }
    }
  }
}
