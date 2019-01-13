package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007808.
 * @author Sean A. Irvine
 */
public class A007808 implements Sequence {

  private Z mPrev = Z.ONE;
  private Z mSum = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mSum = mSum.add(mPrev);
      mPrev = mSum.add(mPrev.multiply(mN));
    }
    return mPrev;
  }
}
