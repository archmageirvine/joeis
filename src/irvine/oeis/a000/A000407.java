package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000407 a(n) = (2n+1)! / n!.
 * @author Sean A. Irvine
 */
public class A000407 implements Sequence {

  private long mN = -1;
  private Z mNum = Z.ONE;
  private Z mDen = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mDen = mDen.multiply(mN);
      mNum = mNum.multiply(2 * mN).multiply(2 * mN + 1);
    }
    return mNum.divide(mDen);
  }
}
