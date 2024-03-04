package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068627 a(0) = 0, a(n) = a(n-1) + n if n does not divide a(n-1). a(n) = a(n-1) - n if n divides a(n-1). a(n) = n if a(n-1) = 0.
 * @author Sean A. Irvine
 */
public class A068627 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mA.isZero()) {
      mA = Z.valueOf(mN);
    } else if (mA.mod(mN) == 0) {
      mA = mA.subtract(mN);
    } else {
      mA = mA.add(mN);
    }
    return mA;
  }
}
