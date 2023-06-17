package irvine.oeis.a001;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001055 The multiplicative partition function: number of ways of factoring n with all factors greater than 1 (a(1) = 1 by convention).
 * @author Sean A. Irvine
 */
public class A001055 extends AbstractSequence {

  /** Construct the sequence. */
  public A001055() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();
  protected final Fast mPrime = new Fast();
  protected long mN = 0;

  protected long t(final long n, final long m) {
    if (mPrime.isPrime(n)) {
      return n <= m ? 1 : 0;
    }

    long sum = 0;
    final long excl = Math.min(m + 1, n);
    for (final Z dd : mFactor.factorize(Z.valueOf(n)).divisors()) {
      final long d = dd.longValue();
      if (d != 1 && d < excl) {
        sum += t(n / d, d);
      }
    }
    if (n <= m) {
      ++sum;
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else {
      return Z.valueOf(t(mN, mN));
    }
  }
}
