package irvine.oeis.a214;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a274.A274923;

/**
 * A214665 The y-coordinates of prime numbers in an Ulam spiral oriented counterclockwise with first step east.
 * @author Sean A. Irvine
 */
public class A214665 extends A274923 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z y = super.next();
      if (mPrime.isPrime(++mN)) {
        return y;
      }
    }
  }
}
