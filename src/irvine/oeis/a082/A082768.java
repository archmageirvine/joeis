package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082768 Numbers that begin with 1, 3, 7 or 9.
 * @author Sean A. Irvine
 */
public class A082768 extends Sequence1 {

  private long mLim = 1;
  private long mN = 0;
  private long mS = 0;

  @Override
  public Z next() {
    if (mS == 0) {
      mS = 1;
      return Z.ONE;
    }
    if (++mN >= mLim) {
      if (mS == 1) {
        mS = 3;
      } else if (mS == 3) {
        mS = 7;
      } else if (mS == 7) {
        mS = 9;
      } else {
        mS = 1;
        mLim *= 10;
      }
      mN = 0;
    }
    return Z.valueOf(mS * mLim + mN);
  }
}
