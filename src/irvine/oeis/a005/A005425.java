package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005425 a(n) = 2*a(n-1) + (n-1)*a(n-2).
 * @author Sean A. Irvine
 */
public class A005425 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN < 2) {
      if (mN == 0) {
        return Z.ONE;
      }
    } else {
      final Z t = mB.multiply2().add(mA.multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
