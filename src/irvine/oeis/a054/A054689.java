package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054689 6 consecutive primes differ by 2n or more starting at a(n).
 * @author Sean A. Irvine
 */
public class A054689 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;
  private final int mCount;

  protected A054689(final int count) {
    mCount = count - 1;
  }

  /** Construct the sequence. */
  public A054689() {
    this(6);
  }

  private boolean is(long p) {
    for (int k = 0; k < mCount; ++k) {
      final long q = p;
      p = mPrime.nextPrime(p);
      if (p - q < 2 * mN) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mP)) {
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}

