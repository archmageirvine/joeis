package irvine.oeis.a039;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000045;

/**
 * A039913 Triangular "Fibonacci array".
 * @author Sean A. Irvine
 */
public class A039913 extends MemoryFunction2Sequence<Integer, Z> {

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return mFibo.a(n);
    }
    if (n == m + 1) {
      return mFibo.a(m + 2);
    }
    return get(n - 1, m).add(get(n - 2, m));
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
