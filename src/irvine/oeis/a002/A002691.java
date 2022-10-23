package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;


/**
 * A002691 a(n) = (n+2) * (2n+1) * (2n-1)! / (n-1)!.
 * @author Sean A. Irvine
 */
public class A002691 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(2 * mN - 1).multiply(2 * mN - 2).divide(mN - 1);
    }
    return mN == 0 ? Z.ONE : mA.multiply(mN + 2).multiply(2 * mN + 1);
  }
}
