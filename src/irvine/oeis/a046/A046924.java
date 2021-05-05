package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046924 Number of ways to express n as p+2q; p, q = 1 or prime.
 * @author Sean A. Irvine
 */
public class A046924 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int cnt = 0;
    for (long k = 1, p; (p = mN - 2 * k) > 0; k = mPrime.nextPrime(k)) {
      if (p == 1 || mPrime.isPrime(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
