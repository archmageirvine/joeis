package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057949 Numbers with more than one factorization into S-primes. See A054520 and A057948 for definition.
 * @author Sean A. Irvine
 */
public class A057949 implements Sequence {

  private final Sequence mS = new A057948();
  private final TreeSet<Long> mA = new TreeSet<>();
  private final TreeSet<Long> mSPrimes = new TreeSet<>();
  {
    mSPrimes.add(mS.next().longValue()); // avoid need for isEmpty check later
  }
  private long mN = 437;

  private boolean isSPrime(final long n) {
    while (n > mSPrimes.last()) {
      mSPrimes.add(mS.next().longValueExact());
    }
    return mSPrimes.contains(n);
  }

  private boolean is(final long n) {
    int cnt = 0;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (mA.contains(d) || (d > 1 && d * d <= n && isSPrime(d) && isSPrime(n / d) && ++cnt > 1)) {
        mA.add(n);
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
