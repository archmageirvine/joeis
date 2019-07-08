package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024404 Number of products of distinct primes <code>&lt;= prime(n)</code> equal to <code>-1 (mod prime(n))</code>.
 * @author Sean A. Irvine
 */
public class A024404 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mCount = 0;

  private void search(final long prod, final long p) {
    final long q = mPrime.nextPrime(p);
    if (q < mP) {
      search(prod, q);
      search((prod * q) % mP, q);
    } else if (prod == mP - 1) {
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
