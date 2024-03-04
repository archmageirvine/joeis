package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068630 a(0)=0; a(n) = n + a(n-1) if gcd(n,a(n-1)) = 1 or a(n-1) = 0; a(n) = a(n-1) - n if n divides a(n-1), otherwise a(n) = a(n-1).
 * @author Sean A. Irvine
 */
public class A068630 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mA.isZero() || mA.gcd(Z.valueOf(mN)).equals(Z.ONE)) {
      mA = mA.add(mN);
    } else if (mA.mod(mN) == 0) {
      mA = mA.subtract(mN);
    }
    return mA;
  }
}
