package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025164 a(n) = a(n-2) + (2n-1)a(n-1); a(0)=1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A025164 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mA.add(mB.multiply(2 * mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
