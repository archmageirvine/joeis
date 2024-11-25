package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073310 a(n) is the smallest number k such that 2+k and 2n+k are both prime.
 * @author Sean A. Irvine
 */
public class A073310 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long k = -1;
    while (true) {
      k += 2;
      if (mPrime.isPrime(k + 2) && mPrime.isPrime(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}

