package irvine.oeis.a030;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A030527 A convolution triangle of numbers obtained from A036083.
 * @author Sean A. Irvine
 */
public class A030527 extends MemoryFunction2Sequence<Integer, Z> {

  protected int mN = 0;
  protected int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n < m) {
      return Z.ZERO;
    }
    if (n == 1) {
      return m == 1 ? Z.ONE : Z.ZERO;
    }
    return get(n - 1, m).multiply(5L * m + n - 1).multiply(5).add(get(n - 1, m - 1).multiply(m)).divide(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
