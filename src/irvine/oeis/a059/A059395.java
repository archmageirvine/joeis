package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a005.A005385;

/**
 * A059395 Smaller of safe prime twins: special safe primes (A005385) p such that the next prime is also the next safe prime and is p+12, i.e., occurs at the closest possible distance, 12.
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
