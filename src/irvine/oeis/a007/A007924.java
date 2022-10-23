package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007924 The number n written using the greedy algorithm in the base where the values of the places are 1 and primes.
 * @author Sean A. Irvine
 */
public class A007924 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.valueOf(mN);
    }
    final StringBuilder sb = new StringBuilder();
    long p = mPrime.prevPrime(mN + 1);
    long n = mN;
    while (p > 0) {
      if (n >= p) {
        sb.append('1');
        n -= p;
      } else {
        sb.append('0');
      }
      p = mPrime.prevPrime(p);
    }
    sb.append(n >= 1 ? '1' : '0');
    return new Z(sb);
  }
}
