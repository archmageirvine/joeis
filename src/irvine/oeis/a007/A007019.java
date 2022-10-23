package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007019 a(n) = (2n+1)! / 2^n.
 * @author Sean A. Irvine
 */
public class A007019 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).multiply(2 * mN + 1);
    }
    return mA;
  }
}

