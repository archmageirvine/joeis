package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010844 a(n) = 2*n*a(n-1) + 1 with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A010844 extends Sequence0 {

  private int mN = -2;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mA = mA.multiply(mN).add(1);
    }
    return mA;
  }
}
