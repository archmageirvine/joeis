package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a005.A005385;

/**
 * A059394 Special safe primes (from A005385) such that the next prime is also a safe prime.
 * @author Sean A. Irvine
 */
public class A059394 extends A005385 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mA;
      mA = super.next();
      if (mPrime.nextPrime(p).equals(mA)) {
        return p;
      }
    }
  }
}
