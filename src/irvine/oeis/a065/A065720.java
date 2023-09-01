package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A065720 Primes whose binary representation is also the decimal representation of a prime.
 * @author Georg Fischer
 */
public class A065720 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private final long[] mDigits;
  private Z mP;
  private final Z mSourceBase;
  private final int mTargetBase;

  /** Construct the sequence. */
  public A065720() {
    this(1, 2, 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param sourceBase source base
   * @param targetBase target base
   */
  public A065720(final int offset, final int sourceBase, final int targetBase) {
    super(offset);
    mP = Z.ONE;
    mSourceBase = Z.valueOf(sourceBase);
    mTargetBase = targetBase;
    mDigits = new long[256]; // sufficient for primes until 10^80
  }

  /**
   * Compute the source digits, and store them in <em>mDigits</em>.
   * @param number number to be represented in the source base (which may be a positive int)
   * @return index of the highest digit in <em>mDigits</em>, or -1 if a digit is not allowed in the target base
   */
  private int getSourceDigits(Z number) {
    int last = -1;
    do {
      final Z[] quot = number.divideAndRemainder(mSourceBase);
      number = quot[0];
      final long residue = quot[1].longValue();
      if (residue >= mTargetBase) {
        return -1;
      }
      mDigits[++last] = residue;
    } while (!number.isZero());
    return last;
  }

  /**
   * Test the prime property of the number represented in <em>mDigits</em> after rebasing.
   * @param last index of highest digit in <em>mDigits</em>
   * @return  true iff the target interpretation gives a prime
   */
  private boolean isPrimeRebased(final int last) {
    if (last < 0) {
      return false; // forbidden digit
    }
    Z number = Z.ZERO;
    for (int i = last; i >= 0; --i) {
      number = number.multiply(mTargetBase).add(mDigits[i]);
    }
    return number.isProbablePrime();
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final int last = getSourceDigits(mP);
      if (isPrimeRebased(last)) {
        return mP;
      }
    }
  }
}

