package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A002091.
 * @author Sean A. Irvine
 */
public class A002091 implements Sequence {

  private final LongDynamicBooleanArray mRepresentable = new LongDynamicBooleanArray();
  private final Fast mPrime = new Fast();
  protected long mResQ = 1;
  private long mQ = 0;
  private long mN = 3;

  // Note n is always odd, so we can drop the lowest bit altogether
  private boolean isRepresentable(final long n) {
    return mRepresentable.isSet(n >> 1);
  }

  private void setRepresentable(final long n) {
    if ((n & 1) == 0) {
      return;
    }
    mRepresentable.set(n >> 1);
  }

  private void updateRepresentable(final long q, final long n) {
    long r = 1;
    setRepresentable(2 + q);
    while (2 * (r = mPrime.nextPrime(r)) <= n) {
      setRepresentable(2 * r + q);
    }
  }

  private void updateForNewN(final long q, final long n) {
    long p = n / 2 - 1;
    while (2 * (p = mPrime.nextPrime(p)) < n) {
      final long p2 = 2 * p;
      setRepresentable(p2 + 1);
      long r = 1;
      while ((r = mPrime.nextPrime(r)) <= q) {
        setRepresentable(p2 + r);
      }
    }
  }

  @Override
  public Z next() {
    if (mQ == 0) {
      // Return immediately to avoid special cases below
      mQ = 1;
      return Z.THREE;
    }
    // Cross out all numbers representable up to the next q
    while (true) {
      mN += 2;
      updateForNewN(mQ, mN);
      if (!isRepresentable(mN)) {
        final Z res = Z.valueOf(mN);
        mResQ = mQ;
        // Keep going until this representation is found because
        // it can be more than one prime before that happens
        do {
          mQ = mPrime.nextPrime(mQ);
          updateRepresentable(mQ, mN);
        } while (!isRepresentable(mN));
        return res;
      }
    }
  }
}
