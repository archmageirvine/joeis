package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051711 a(0) = 1; for n &gt; 0, a(n) = n!*4^n/2.
 * @author Sean A. Irvine
 */
public class A051711 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN == 1) {
      return Z.TWO;
    }
    mF = mF.multiply(mN).shiftLeft(2);
    return mF;
  }
}

