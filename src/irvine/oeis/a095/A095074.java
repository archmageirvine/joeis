package irvine.oeis.a095;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A095074 Primes in whose binary expansion the number of 0-bits is less than or equal to number of 1-bits.
 * @author Georg Fischer
 */
public class A095074 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private int mDist;

  /** Construct the sequence. */
  public A095074() {
    // Primes in whose binary expansion the number of 1-bits is >  -1 + number of 0-bits.
    this(-1);
  }

  /**
   * Generic constructor with parameters
   * @param dist distance bitween bit counts
   */
  public A095074(final int dist) {
    mDist = dist;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final int n1 = mP.bitCount();
      final int n0 = mP.bitLength() - n1;
      if (n1 > mDist + n0) {
        return mP;
      }
    }
  }
}
