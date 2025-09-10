package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080220 a(1)=2; then if n is prime, a(n) is the smallest prime number greater than a(n-1), if n is composite a(n)=a(n-1)+1.
 * @author Sean A. Irvine
 */
public class A080220 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      if (mPrime.isPrime(mN)) {
        mA = mPrime.nextPrime(mA);
      } else {
        mA = mA.add(1);
      }
    }
    return mA;
  }
}

