package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001990 Let p be the n-th odd prime. <code>a(n)</code> is the least prime congruent to 5 modulo 8 such that <code>Legendre(-a(n)</code>, q) <code>= -Legendre(-2</code>, q) for all odd primes q <code>&lt;=</code> p.
 * @author Sean A. Irvine
 */
public class A001990 implements Sequence {

  private static final Z NEG_TWO = Z.valueOf(-2);
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
        if (mP.jacobi(q) != -NEG_TWO.jacobi(q)) {
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
