package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067605 Least k such that gcd(prime(k+1)-1, prime(k)-1) = 2n.
 * @author Sean A. Irvine
 */
public class A067605 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long k = 0;
    long p = 2;
    while (true) {
      ++k;
      final long q = p;
      p = mPrime.nextPrime(p);
      if (Functions.GCD.l(p - 1, q - 1) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

