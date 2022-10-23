package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051535 a(n)=2*a(n-1), except every tenth time you multiply by 1000/512 instead of by 2.
 * @author Sean A. Irvine
 */
public class A051535 extends Sequence0 {

  private Z mA = null;
  private int mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (++mN == 10) {
      mN = 0;
      mA = mA.shiftRight(9).multiply(1000);
    } else {
      mA = mA.multiply2();
    }
    return mA;
  }
}
