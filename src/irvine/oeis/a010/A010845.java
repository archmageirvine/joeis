package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010845 a(n) = 3*n*a(n-1) + 1, a(0) = 1.
 * @author Sean A. Irvine
 */
public class A010845 extends Sequence0 {

  private int mN = -3;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 3;
    if (mN > 0) {
      mA = mA.multiply(mN).add(1);
    }
    return mA;
  }
}
