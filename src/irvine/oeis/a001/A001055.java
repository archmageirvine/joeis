package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001055 The multiplicative partition function: number of ways of factoring n with all factors greater than <code>1 (a(1) = 1</code> by <code>convention)</code>.
 * @author Sean A. Irvine
 */
public class A001055 implements Sequence {

  private final Fast mPrime = new Fast();
  protected long mN = 0;

  private long t(final long n, final long m) {
    if (mPrime.isPrime(n)) {
      return n <= m ? 1 : 0;
    }

    long sum = 0;
    final long excl = Math.min(m + 1, n);
    for (final Z dd : Cheetah.factor(n).divisors()) {
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
