package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007808 Number of directed column-convex polyominoes of height n: a(k+1)=(k+1)*a(k)+(a(1)+...+a(k)).
 * @author Sean A. Irvine
 */
public class A007808 extends Sequence0 {

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
