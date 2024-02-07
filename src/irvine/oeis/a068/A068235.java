package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068235 a(n) is the smallest prime p such that p and the next n-1 primes are all == 11 (mod 12).
 * @author Sean A. Irvine
 */
public class A068235 extends A068232 {

  @Override
  protected long count(Z p) {
    long cnt = 0;
    while (p.mod(12) == 11) {
      ++cnt;
      p = mPrime.nextPrime(p);
    }
    return cnt;
  }
}
