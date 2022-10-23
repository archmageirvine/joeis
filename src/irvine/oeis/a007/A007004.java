package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007004 a(n) = (3*n)! / ((n+1)*(n!)^3).
 * @author Sean A. Irvine
 */
public class A007004 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(3 * mN - 2).multiply(3 * mN - 1).multiply(3).divide(mN + 1).divide(mN);
    }
    return mA;
  }
}

