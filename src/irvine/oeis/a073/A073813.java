package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A073813 Difference between n and largest unrelated number belonging to n, when n runs over composite numbers. For primes and for 4, unrelated set is empty.
 * @author Sean A. Irvine
 */
public class A073813 extends A073759 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final long maxUnrelated = super.next().longValueExact();
      if (!mPrime.isPrime(++mN)) {
        return mN == 4 ? Z.ZERO : Z.valueOf(mN - maxUnrelated);
      }
    }
  }
}
