package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072555 Smallest of four consecutive integers divisible by four consecutive primes respectively.
 * @author Sean A. Irvine
 */
public class A072555 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private final int mLength;

  protected A072555(final int lenth) {
    mLength = lenth;
  }

  /** Construct the sequence. */
  public A072555() {
    this(4);
  }

  private boolean is(final long n, final long p) {
    long q = p;
    for (int k = 1; k < mLength; ++k) {
      q = mPrime.nextPrime(q);
      if ((n + k) % q != 0) {
        return false;
      }
    }
    return true;
  }

  private boolean is(final long n) {
    for (final Z p : Jaguar.factor(n).toZArray()) {
      if (is(n, p.longValue())) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
