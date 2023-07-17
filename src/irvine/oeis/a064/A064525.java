package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A064525 Smallest Fibonacci number with a prime number of decimal digits.
 * @author Sean A. Irvine
 */
public class A064525 extends A000045 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private Z mF = super.next();
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (mF.toString().length() != mP) {
      mF = super.next();
    }
    return mF;
  }
}

