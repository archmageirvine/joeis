package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000776 a(n) = n! * (1 + 2*Sum_{k=1..n} 1/k).
 * @author Sean A. Irvine
 */
public class A000776 extends Sequence0 {

  private Z mPrev = Z.ONE;
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mPrev = mPrev.multiply(mN).add(mF.multiply2());
      if (mN > 1) {
        mF = mF.multiply(mN);
      }
    }
    return mPrev;
  }
}
