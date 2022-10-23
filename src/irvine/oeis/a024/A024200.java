package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024200 a(0) = 1, a(1) = 0, a(n+1) = 2*a(n) + (2*n-1)^2*a(n-1).
 * @author Sean A. Irvine
 */
public class A024200 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 1) {
      final Z t = mB.multiply2().add(mA.multiply(Z.valueOf(2 * mN - 3).square()));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

