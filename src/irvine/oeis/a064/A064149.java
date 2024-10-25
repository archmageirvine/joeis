package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a036.A036263;

/**
 * A064149 Indices of zeros of third differences of primes: Numbers k such that A036264(k) = 0.
 * @author Sean A. Irvine
 */
public class A064149 extends A036263 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
