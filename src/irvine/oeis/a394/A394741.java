package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394741 a(n) = number of triples (x, y, z) such that x^2 + y*z = n, where x, y, z are primes, not necessarily distinct, and y &lt;= z.
 * @author Sean A. Irvine
 */
public class A394741 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; p * p < mN; p = mPrime.nextPrime(p)) {
      if (Predicates.SEMIPRIME.is(mN - p * p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
