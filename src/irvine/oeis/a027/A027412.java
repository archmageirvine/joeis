package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027412 a(n) = 2*a(n-1) + (n-2)*a(n-2).
 * @author Sean A. Irvine
 */
public class A027412 extends Sequence0 {

  private long mN = -3;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > -2) {
      final Z t = mB.multiply2().add(mA.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
