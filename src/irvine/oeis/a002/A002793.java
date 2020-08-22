package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002793 a(n) = 2n*a(n-1) - (n-1)^2*a(n-2).
 * @author Sean A. Irvine
 */
public class A002793 implements Sequence {

  long mN = -1;
  Z mA = Z.ZERO;
  Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN > 1) {
      final Z t = mB.multiply(2 * mN).subtract(mA.multiply(mN - 1).multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
