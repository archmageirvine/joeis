package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001992 Let p <code>= n-th</code> odd prime. Then <code>a(n) =</code> least prime congruent to 5 modulo 8 such that <code>Legendre(a(n), q) = -1</code> for all odd primes q <code>&lt;=</code> p.
 * @author Sean A. Irvine
 */
public class A001992 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      Z q = Z.TWO;
      boolean ok = true;
      for (int k = 0; k < mN; ++k) {
        q = mPrime.nextPrime(q);
        if (mP.jacobi(q) != -1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return mP;
      }
      do {
        mP = mPrime.nextPrime(mP);
      } while (!mP.and(Z.SEVEN).equals(Z.FIVE));
    }
  }
}
