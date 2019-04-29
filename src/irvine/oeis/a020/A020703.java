package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020703.
 * @author Sean A. Irvine
 */
public class A020703 implements Sequence {

  private long mN = 0;
  private long mSectionLength = -1;
  private long mLower = 2;

  @Override
  public Z next() {
    if (--mN < mLower) {
      mLower += mSectionLength;
      mSectionLength += 2;
      mN = mLower + mSectionLength - 1;
    }
    return Z.valueOf(mN);
  }
}
