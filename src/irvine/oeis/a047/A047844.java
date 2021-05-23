package irvine.oeis.a047;

import irvine.factor.prime.Fast;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047844 Patrick De Geest's "Generations" array read by antidiagonals: a(n,1) = n-th prime, a(1,k+1) = a(2,k), a(n,k+1) = a(n-1,k) + a(n+1,k).
 * @author Sean A. Irvine
 */
public class A047844 extends MemoryFunction2<Long, Z> implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mN = 1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 1) {
      // NOTE: This makes assumption that it will be called with incrementing n!
      mP = mPrime.nextPrime(mP);
      return mP;
    }
    return n == 1 ? get(2L, m - 1) : get(n - 1, m - 1).add(get(n + 1, m - 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return get(mN - mM, mM);
  }
}
