package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064802 a(n) = Min { m &gt; n | prime factorizations of m and n differ in one factor only}, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A064802 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final FactorSequence a, long m) {
    int delta = 0;
    for (final Z pp : a.toZArray()) {
      final int e = a.getExponent(pp);
      if (e > 0) {
        final long p = pp.longValue();
        for (int k = e; k > 0; --k) {
          if (m % p == 0) {
            m /= p;
          } else if (k > 1 || ++delta > 1) {
            return false;
          } else {
            break;
          }
        }
      }
    }
    return mPrime.isPrime(m);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    long m = mN;
    while (true) {
      if (is(fs, ++m)) {
        return Z.valueOf(m);
      }
    }
  }
}

