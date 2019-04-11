package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001194 Expansion of an integral.
 * @author Sean A. Irvine
 */
public class A001194 implements Sequence {

  private Z mPrev = Z.THREE;
  private long mN = 1;
  private Z mDF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 2) {
      if (mN > 3) {
        mDF = mDF.multiply(2 * mN - 7);
      }
      mPrev = mPrev.multiply(2 * mN - 1).subtract(mDF.multiply(mN - 1).multiply(3));
    }
    return mPrev;
  }
}
