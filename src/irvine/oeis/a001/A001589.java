package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001589 a(n) = 4^n + n^4.
 * @author Sean A. Irvine
 */
public class A001589 extends Sequence0 {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.shiftLeft(2);
    }
    return mT.add(Z.valueOf(mN * mN).square());
  }
}
