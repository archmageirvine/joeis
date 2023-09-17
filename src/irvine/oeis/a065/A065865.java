package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065865 a(n) is the least k such that nk - 1 and nk + 1 are both composite.
 * @author Sean A. Irvine
 */
public class A065865 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (!mPrime.isPrime(mN * ++k + 1) && !mPrime.isPrime(mN * k - 1)) {
        return Z.valueOf(k);
      }
    }
  }
}
