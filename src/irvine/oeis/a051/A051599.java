package irvine.oeis.a051;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000040;

/**
 * A051599 Rows of triangle formed using Pascal's rule except begin and end n-th row with (n+1)st prime.
 * @author Sean A. Irvine
 */
public class A051599 extends MemoryFunction2Sequence<Integer, Z> {

  private final MemorySequence mP = MemorySequence.cachedSequence(new A000040());
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (m == 0 || m.equals(n)) {
      return mP.a(mN);
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}

