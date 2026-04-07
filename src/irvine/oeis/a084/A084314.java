package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084314 a(n) is the smallest number k such that gcd(prime(k)+1, k) = n.
 * @author Sean A. Irvine
 */
public class A084314 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long p = 1;
    while (true) {
      ++k;
      p = mPrime.nextPrime(p);
      if (Functions.GCD.l(p + 1, k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
