package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002223 Smallest prime p of form p <code>= 8k-1</code> such that first n primes <code>(p_1=2</code>, ..., <code>p_n)</code> are quadratic residues <code>mod</code> p.
 * @author Sean A. Irvine
 */
public class A002223 implements Sequence {

  // I suspect there must be a sieve approach to this...

  private final Fast mPrime = new Fast();
  private Z mP = Z.SEVEN;
  private int mN = 0;

  protected Z residueClass() {
    return Z.SEVEN;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.and(Z.SEVEN).equals(residueClass())) {
        Z p = Z.ONE;
        boolean ok = true;
        for (int k = 0; k < mN; ++k) {
          p = mPrime.nextPrime(p);
          if (p.jacobi(mP) != 1) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return mP;
        }
      }
      mP = mPrime.nextPrime(mP);
    }
  }
}
