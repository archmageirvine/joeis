package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056921 a(0) = 0, a(1) = 1, a(2*n) = n*a(2*n-1) + a(2*n-2), a(2*n+1) = a(2*n) + a(2*n-1).
 * @author Sean A. Irvine
 */
public class A056921 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN > 1) {
      final Z t = (mN & 1) == 0 ? mA.add(mB.multiply(mN / 2)) : mA.add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
