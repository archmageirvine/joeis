package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006298.
 * @author Sean A. Irvine
 */
public class A006298 implements Sequence {

  private Z mPrev = null;
  private long mN = 3;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.valueOf(21);
    } else {
      ++mN;
      mPrev = mPrev.multiply(4 * mN + 2).multiply(5 * mN + 3)
        .divide(5 * mN - 2).divide(mN - 3);
    }
    return mPrev;
  }
}
