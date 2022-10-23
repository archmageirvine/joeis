package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;


/**
 * A002690 a(n) = (n+1) * (2*n)! / n!.
 * @author Sean A. Irvine
 */
public class A002690 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN).multiply(2 * mN - 1).divide(mN);
    }
    return mA.multiply(mN + 1);
  }
}
