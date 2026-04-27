package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394740 a(n) = number of triples (x, y, z) such that x^2 + y*z = n, where x, y, z are distinct primes and y &lt; z.
 * @author Sean A. Irvine
 */
public class A394740 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; p * p < mN; p = mPrime.nextPrime(p)) {
      if (mN % p != 0) {
        final long m = mN - p * p;
        if (!Predicates.SQUARE.is(m) && Predicates.SEMIPRIME.is(m)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
