package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084316 a(n) is the smallest number x such that gcd(prime(x)+1,x+1) = n.
 * @author Sean A. Irvine
 */
public class A084316 extends Sequence1 {

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
      if (Functions.GCD.l(p + 1, k + 1) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
