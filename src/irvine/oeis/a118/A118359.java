package irvine.oeis.a118;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a117.A117078;

/**
 * A118359 Primes for which the weight as defined in A117078 is 7 and the gap as defined in A001223 is 6.
 * @author Georg Fischer
 */
public class A118359 extends A117078 {

  private int mN;
  private Z mWeight;
  private Z mGap;
  private final Fast mPrime = new Fast();
  private Z mP1; // current prime
  private Z mP0; // previous prime

  /** Construct the sequence. */
  public A118359() {
    this(1, 7, 6);
  }

  /**
   * Generic constructor with parameters
   * @param weight
   * @param gap
   */
  public A118359(final int offset, final int weight, final int gap) {
    mN = 0;
    mWeight = Z.valueOf(weight);
    mGap = Z.valueOf(gap);
    mP1 = Z.TWO;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP0 = mP1;
      mP1 = mPrime.nextPrime(mP1);
      final Z[] wg = compute(mP0, mP1); // [0] is the weight, [1] is the gap
      if (wg[0].equals(mWeight) && wg[1].equals(mGap)) {
        return mP0;
      }
    }
  }
}
