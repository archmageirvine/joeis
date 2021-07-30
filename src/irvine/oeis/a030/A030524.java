package irvine.oeis.a030;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030524 A convolution triangle of numbers obtained from A036068.
 * @author Sean A. Irvine
 */
public class A030524 extends MemoryFunction2<Integer, Z> implements Sequence {

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
    return get(n - 1, m).multiply(3L * m + n - 1).multiply(3).add(get(n - 1, m - 1).multiply(m)).divide(n);
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
