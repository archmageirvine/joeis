package irvine.oeis.a214;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a174.A174344;

/**
 * A214664 The x-coordinates of prime numbers in an Ulam spiral oriented counterclockwise with first step east.
 * @author Sean A. Irvine
 */
public class A214664 extends A174344 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z x = super.next();
      if (mPrime.isPrime(++mN)) {
        return x;
      }
    }
  }
}
