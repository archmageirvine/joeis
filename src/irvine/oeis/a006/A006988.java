package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006988 a(n) = (10^n)-th prime.
 * @author Sean A. Irvine
 */
public class A006988 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mT = 1;
  private long mN = 1;
  private Z mP = Z.ONE;
  private final int mBase;

  /** Construct the sequence. */
  public A006988() {
    this(0, 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base base for number of primes
   */
  public A006988(final int offset, final int base) {
    super(offset);
    mBase = base;
  }

  protected long base() {
    return mBase;
  }

  @Override
  public Z next() {
    for (long m = mN; m > 0; --m) {
      mP = mPrime.nextPrime(mP);
    }
    mN = mT * (base() - 1);
    mT *= base();
    return mP;
  }
}
