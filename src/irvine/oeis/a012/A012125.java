package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012125 Expansion of x/ (1-4*x+16*x^2)^(3/2).
 * @author Sean A. Irvine
 */
public class A012125 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN);
    } else {
      final Z t = mB.multiply(2 * mN - 1).multiply2().subtract(mA.multiply(mN).multiply(16)).divide(mN - 1);
      mA = mB;
      mB = t;
      return t;
    }
  }
}
