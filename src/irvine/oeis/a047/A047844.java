package irvine.oeis.a047;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;

/**
 * A047844 Patrick De Geest's "Generations" array read by antidiagonals: a(n,1) = n-th prime, a(1,k+1) = a(2,k), a(n,k+1) = a(n-1,k) + a(n+1,k).
 * @author Sean A. Irvine
 */
public class A047844 extends MemoryFunction2Sequence<Long, Z> {

  private final MemorySequence mPrime = MemorySequence.cachedSequence(new A000040());
  private long mN = 1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 1) {
      return mPrime.a((int) (n - 1));
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
