package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065898 Which composite number is the product of first n primes (the n-th primorial number)?.
 * @author Sean A. Irvine
 */
public class A065898 extends A002808 {

  private final Fast mPrime = new Fast();
  private long mM = 0;
  private Z mP = Z.ZERO;
  private Z mPrimorial = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mPrimorial = mPrimorial.multiply(mP);
    if (mPrimorial.equals(Z.TWO)) {
      return Z.ZERO;
    }
    while (true) {
      ++mM;
      if (mPrimorial.equals(super.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}
