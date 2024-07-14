package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A006880 Number of primes &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A006880 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006880(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006880() {
    super(0);
  }

  private final Fast mPrime = new Fast();
  private long mLimit = 1;
  private long mP = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    while (mP < mLimit) {
      mP = mPrime.nextPrime(mP);
      ++mCount;
    }
    mLimit *= 10;
    return Z.valueOf(mCount - 1);
  }

  @Override
  public Z a(final Z n) {
    return Functions.PRIME_PI.z(Z.TEN.pow(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.PRIME_PI.z(Z.TEN.pow(n));
  }

}
