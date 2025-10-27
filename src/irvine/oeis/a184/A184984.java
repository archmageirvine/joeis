package irvine.oeis.a184;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A184984 Primes followed by a gap of 160 = nextprime(p)-p.
 * @author Georg Fischer
 */
public class A184984 extends AbstractSequence {

  private final Z mGap;
  private final Fast mPrime = new Fast();
  private Z mP;

  /** Construct the sequence. */
  public A184984() {
    this(1, 160, Z.valueOf(33803688));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param gap required distance to next prime
   * @param start starting point (any number less than the first term)
   */
  public A184984(final int offset, final int gap, final Z start) {
    super(offset);
    mGap = Z.valueOf(gap);
    mP = start;
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param gap required distance to next prime
   */
  public A184984(final int offset, final int gap) {
    super(offset);
    mGap = Z.valueOf(gap);
    mP = Z.ONE;
  }

  @Override
  public Z next() {
    while (true) {
      final Z pn = mPrime.nextPrime(mP);
      if (pn.subtract(mP).equals(mGap)) {
        final Z result = mP;
        mP = pn;
        return result;
      }
      mP = pn;
    }
  }
}
