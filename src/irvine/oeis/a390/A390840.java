package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a080.A080082;

/**
 * A390840 a(n) is the number of primes q &lt;= A080082(n) such that prime(n) divides q + 1.
 * @author Sean A. Irvine
 */
public class A390840 extends A080082 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    final long lim = super.next().longValueExact();
    mP = mPrime.nextPrime(mP);
    long q = 2;
    long cnt = 0;
    while (q <= lim) {
      if ((q + 1) % mP == 0) {
        ++cnt;
      }
      q = mPrime.nextPrime(q);
    }
    return Z.valueOf(cnt);
  }
}

