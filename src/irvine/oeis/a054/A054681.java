package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054681 Start of a run of consecutive primes of length n each ending with the same digit.
 * @author Sean A. Irvine
 */
public class A054681 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private int mN = -1;
  private final long mGap;

  protected A054681(final int gap) {
    mGap = gap;
  }

  /** Construct the sequence. */
  public A054681() {
    this(10);
  }

  private int cnt(long p) {
    if ((p - mPrime.prevPrime(p)) % mGap == 0) {
      return 0;
    }
    int cnt = 0;
    while (true) {
      final long q = p;
      p = mPrime.nextPrime(p);
      if ((p - q) % mGap != 0) {
        return cnt;
      }
      ++cnt;
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final int cnt = cnt(mP);
      if (cnt >= mN) {
        return Z.valueOf(mP);
      }
      mP = mPrime.nextPrime(mP);
    }
  }
}

