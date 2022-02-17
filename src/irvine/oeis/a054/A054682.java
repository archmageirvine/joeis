package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054682 a(n) = smallest prime p = prime(k) such that gcd( prime(k+1) - prime(k), prime(k+2) - prime(k+1) ) is a multiple of 2n.
 * @author Sean A. Irvine
 */
public class A054682 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    long q = 3;
    while (true) {
      final long r = mPrime.nextPrime(q);
      if ((q - p) % mN == 0 && (r - q) % mN == 0) {
        return Z.valueOf(p);
      }
      p = q;
      q = r;
    }
  }
}
