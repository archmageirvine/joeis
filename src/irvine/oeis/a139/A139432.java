package irvine.oeis.a139;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A139432.
 * @author Sean A. Irvine
 */
public class A139432 implements Sequence {

  private long mN = -1;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    if (++mN != 0) {
      final Z d = Z.valueOf(Cheetah.factor(mN).sigma0());
      if (mPrev.compareTo(d) >= 0) {
        mPrev = mPrev.subtract(d);
      } else {
        mPrev = mPrev.add(d);
      }
    }
    return mPrev;
  }
}

