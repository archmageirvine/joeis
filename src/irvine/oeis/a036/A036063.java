package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A036063 Increasing gaps among twin primes: size.
 * @author Sean A. Irvine
 */
public class A036063 extends A001359 {

  private Z mA = super.next();
  private Z mGap = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z d = mA.subtract(t);
      if (d.compareTo(mGap) > 0) {
        mGap = d;
        return mA.subtract(t).subtract(2);
      }
    }
  }
}
