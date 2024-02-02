package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068181 a(n)=-1/b(2n) where 1/(e^y-e^(y/3))= sum(i=-1,inf,b(i)*y^i).
 * @author Sean A. Irvine
 */
public class A068181 extends Sequence0 {

  private long mN = -6;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 6;
    if (mN > 0) {
      mA = mA.multiply(mN).multiply(mN - 3);
    }
    return mA;
  }
}
