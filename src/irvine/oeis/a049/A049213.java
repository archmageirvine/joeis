package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A049213 A convolution triangle of numbers obtained from A025749.
 * @author Sean A. Irvine
 */
public class A049213 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A049213() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  protected long param() {
    return 4;
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 1 || m > n) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(param() * (n - 1) - m).multiply(param()).add(get(n - 1, m - 1).multiply(m)).divide(n);
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
