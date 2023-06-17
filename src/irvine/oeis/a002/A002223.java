package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002223 Smallest prime p of form p = 8k-1 such that first n primes (p_1=2, ..., p_n) are quadratic residues mod p.
 * @author Sean A. Irvine
 */
public class A002223 extends AbstractSequence {

  /** Construct the sequence. */
  public A002223() {
    super(1);
  }

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
