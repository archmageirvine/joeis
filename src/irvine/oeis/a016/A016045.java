package irvine.oeis.a016;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016045 a(n) is the smallest prime p(k) such that the gaps between the primes p(k), p(k+1), p(k+2), ..., p(k+n) are 2, 4, 6, ... 2n.
 * @author Sean A. Irvine
 */
public class A016045 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    outer:
    while (true) {
      Z q = mP;
      Z delta = Z.TWO;
      for (int k = 1; k <= mN; ++k, delta = delta.add(2L * k)) {
        q = mPrime.nextPrime(q);
        if (!q.subtract(mP).equals(delta)) {
          mP = mPrime.nextPrime(mP);
          continue outer;
        }
      }
      return mP;
    }
  }
}
