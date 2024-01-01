package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067665 The start of a record-setting run of consecutive integers i with distinct A001222(i).
 * @author Sean A. Irvine
 */
public class A067665 extends Sequence1 {

  private final long[] mOmegas = new long[Long.SIZE];
  private long mSeen = 0;
  private int mHead = 0;
  private int mTail = 0;
  private long mN = 0;
  private long mLen = 0;
  private long mMax = 1;

  @Override
  public Z next() {
    while (true) {
      final long omega = Jaguar.factor(++mN).bigOmega();
      if (omega >= Long.SIZE) {
        throw new UnsupportedOperationException();
      }
      final long bit = 1L << omega;
      if (mHead == mOmegas.length) {
        mHead = 0;
      }
      mOmegas[mHead++] = omega;
      final long len = mLen;
      // Handle end of run
      while ((mSeen & bit) != 0) {
        mSeen &= ~(1L << mOmegas[mTail++]);
        if (mTail == mOmegas.length) {
          mTail = 0;
        }
        --mLen;
      }
      // Update for newly computed omega
      mSeen |= bit;
      ++mLen;
      if (len > mMax) {
        mMax = len;
        return Z.valueOf(mN - len);
      }
    }
  }
}
