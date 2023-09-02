package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065422 If n | a(n) then a(n+1) = a(n)/(highest power of n that divides a(n)), otherwise a(n+1) = n*a(n); a(0) = 1.
 * @author Sean A. Irvine
 */
public class A065422 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      if (mA.mod(mN) == 0) {
        do {
          mA = mA.divide(mN);
        } while (mA.mod(mN) == 0);
      } else {
        mA = mA.multiply(mN);
      }
    }
    return mA;
  }
}
