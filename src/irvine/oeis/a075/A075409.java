package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075409 a(n) is the smallest m such that n!-m and n!+m are both primes.
 * @author Sean A. Irvine
 */
public class A075409 extends Sequence2 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    if (mN == 2) {
      return Z.ZERO;
    }
    long m = -1;
    while (true) {
      m += 2;
      if (mF.subtract(m).isProbablePrime() && mF.add(m).isProbablePrime()) {
        return Z.valueOf(m);
      }
    }
  }
}
