package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067834 Norm in ring Z[sqrt(3)] of (((-1+sqrt(3))^n)-1) is prime.
 * @author Sean A. Irvine
 */
public class A067834 extends Sequence1 {

  private Z mA = null;
  private Z mB = Z.valueOf(-2);
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    while (true) {
      final Z t = mA.multiply2().subtract(mB.multiply2());
      mA = mB;
      mB = t;
      final Z u = Z.ONE.signedAdd((++mN & 1) == 0, Z.ONE.shiftLeft(mN)).subtract(t);
      if (u.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
