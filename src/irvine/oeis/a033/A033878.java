package irvine.oeis.a033;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a006.A006318;

/**
 * A033878 Triangular array associated with Schroeder numbers.
 * @author Sean A. Irvine
 */
public class A033878 extends MemoryFunction2Sequence<Integer, Z> {

  // After Michel Marcus

  private int mN = -1;
  private int mM = 0;
  private final MemorySequence mLgs = MemorySequence.cachedSequence(new A006318());

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m > n) {
      return Z.ZERO;
    }
    if (m == 0 || n == 0) {
      return Z.ONE;
    }
    if (n.equals(m)) {
      return mLgs.a(n - 1);
    }
    return get(n, m - 1).add(get(n - 1, m - 1)).add(get(n - 1, m));
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
