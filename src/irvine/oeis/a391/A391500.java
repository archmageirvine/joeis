package irvine.oeis.a391;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391500 a(n) is the number of ways to decompose A152242(n) into primes.
 * @author Sean A. Irvine
 */
public class A391500 extends Sequence1 {

  private long mN = 1;

  private long count(final long n) {
    long m1 = 1;
    long m = 10;
    long cnt = Predicates.PRIME.is(n) ? 1 : 0;
    while (m < n) {
      final long r = n % m;
      if (r > m1 && Predicates.PRIME.is(r)) {
        cnt += count(n / m);
      }
      m1 = m;
      m *= 10;
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      final long cnt = count(++mN);
      if (cnt > 0) {
        return Z.valueOf(cnt);
      }
    }
  }
}
