package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024405 Number of products of distinct primes &lt;= p(n) equal to 1 (mod p(n)).
 * @author Sean A. Irvine
 */
public class A024405 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mCount = 0;

  private void search(final long prod, final long p) {
    final long q = mPrime.nextPrime(p);
    if (q < mP) {
      search(prod, q);
      search((prod * q) % mP, q);
    } else if (prod == 1) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mCount = 0;
    search(1L, 1L);
    return Z.valueOf(mCount);
  }
}
