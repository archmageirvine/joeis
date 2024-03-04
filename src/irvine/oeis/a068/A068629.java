package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068629 a(1) = 1. a(n) = n*a(n-1) if gcd(n,a(n-1)) = 1, a(n-1)/n if n divides a(n-1), otherwise a(n) = a(n-1).
 * @author Sean A. Irvine
 */
public class A068629 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mA.mod(mN) == 0) {
      mA = mA.divide(mN);
    } else if (mA.gcd(Z.valueOf(mN)).equals(Z.ONE)) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
