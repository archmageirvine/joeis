package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077138 a(0) = 0. If n is odd, a(n) = a(n-1) + n, otherwise a(n) = a(n-1) * n.
 * @author Sean A. Irvine
 */
public class A077138 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      mA = mA.multiply(mN);
    } else {
      mA = mA.add(mN);
    }
    return mA;
  }
}

