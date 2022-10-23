package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005154 a(0) = 1, a(1) = 2; thereafter a(n) = 3*a(n-1)^2 - 2*a(n-2)^4.
 * @author Sean A. Irvine
 */
public class A005154 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN + 1);
    }
    final Z t = mB.square().multiply(3).subtract(mA.pow(4).multiply2());
    mA = mB;
    mB = t;
    return mB;
  }
}

