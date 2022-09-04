package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000700;

/**
 * A058886 Sum of the row of the character table of S_n corresponding to the partition 2,1^{n-2}.
 * @author Sean A. Irvine
 */
public class A058886 extends A000700 {

  private Z mSum = super.next().add(super.next());
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(mPrev.multiply2());
    mPrev = super.next();
    mSum = mSum.subtract(mPrev);
    return mSum;
  }
}
