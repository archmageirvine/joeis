package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a005.A005385;

/**
 * A059393.
 * @author Sean A. Irvine
 */
public class A059395 extends A005385 {

  private static final Z TWELVE = Z.valueOf(12);
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mA;
      mA = super.next();
      if (mA.subtract(p).equals(TWELVE) && mPrime.nextPrime(p).equals(mA)) {
        return p;
      }
    }
  }
}
