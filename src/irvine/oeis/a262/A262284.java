package irvine.oeis.a262;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A262284 Primes whose binary expansion begins 101.
 * @author Georg Fischer
 */
public class A262284 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP;
  private final String mStart;

  /** Construct the sequence. */
  public A262284() {
    this("101");
  }

  /**
   * Generic constructor with parameters
   * @param start first bits
   */
  public A262284(final String start) {
    mStart = start;
    mP = Z.TWO;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.toString(2).startsWith(mStart)) {
        return mP;
      }
    }
  }
}
