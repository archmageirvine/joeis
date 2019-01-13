package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012125.
 * @author Sean A. Irvine
 */
public class A012125 implements Sequence {

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
