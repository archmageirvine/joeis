package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007449 a(0) = 7, a(1) = 9; for n &gt;= 0, a(2n+1) = a(2n-1)^2 - a(2n-2), a(2n+2) = a(2n)^2 - a(2n+1).
 * @author Sean A. Irvine
 */
public class A007449 extends Sequence0 {

  private int mN = -1;
  private Z mA = null;
  private Z mB = Z.SEVEN;
  private Z mC = Z.NINE;

  @Override
  public Z next() {
    if (++mN <= 1) {
      if (mN == 0) {
        return Z.SEVEN;
      }
    } else {
      final Z t = mB.square().subtract((mN & 1) == 0 ? mC : mA);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
