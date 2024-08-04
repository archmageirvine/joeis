package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071680 Primes that are the arithmetic mean of their prime predecessor and another prime.
 * @author Sean A. Irvine
 */
public class A071680 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = super.next();
      if (mPrime.isPrime(mP.multiply2().subtract(q))) {
        return mP;
      }
    }
  }
}
