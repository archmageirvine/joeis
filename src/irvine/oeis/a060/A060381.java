package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060381 a(n) = prime(n)*prime(n+1)*...*prime(2*n-1), where prime(i) is the i-th prime.
 * @author Sean A. Irvine
 */
public class A060381 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private long mP = 1;
  private long mQ = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.divide(mP);
      mP = mPrime.nextPrime(mP);
      mA = mA.multiply(mQ);
      mQ = mPrime.nextPrime(mQ);
      mA = mA.multiply(mQ);
      mQ = mPrime.nextPrime(mQ);
    }
    return mA;
  }
}

