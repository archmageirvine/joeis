package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054701 Smallest prime followed by three gaps that are multiples of 2n.
 * @author Sean A. Irvine
 */
public class A054701 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private final int mCount;

  protected A054701(final int count) {
    mCount = count - 1;
  }

  /** Construct the sequence. */
  public A054701() {
    this(4);
  }

  private boolean is(long p) {
    for (int k = 0; k < mCount; ++k) {
      final long q = p;
      p = mPrime.nextPrime(p);
      if ((p - q) % mN != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mN += 2;
    long p = 3;
    while (!is(p)) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}

