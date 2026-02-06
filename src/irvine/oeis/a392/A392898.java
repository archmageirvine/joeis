package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392898 a(n) = a(n-1) + a(n-2) + n! with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A392898 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return mA;
    } else if (mN > 1) {
      mF = mF.multiply(mN);
      final Z t = mA.add(mB).add(mF);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
