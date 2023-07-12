package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A030526 A convolution triangle of numbers obtained from A036070.
 * @author Sean A. Irvine
 */
public class A030526 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A030526() {
    super(1);
  }

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
    return get(n - 1, m).multiply(4L * m + n - 1).multiply(4).add(get(n - 1, m - 1).multiply(m)).divide(n);
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
