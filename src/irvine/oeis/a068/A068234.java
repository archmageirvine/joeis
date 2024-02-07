package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068234 a(n) is the smallest prime p such that p and the next n-1 primes are all == 5 (mod 12).
 * @author Sean A. Irvine
 */
public class A068234 extends A068232 {

  @Override
  protected long count(Z p) {
    long cnt = 0;
    while (p.mod(12) == 5) {
      ++cnt;
      p = mPrime.nextPrime(p);
    }
    return cnt;
  }
}
