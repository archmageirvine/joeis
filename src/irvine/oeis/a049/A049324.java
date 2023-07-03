package irvine.oeis.a049;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A049324 A convolution triangle of numbers generalizing Pascal's triangle A007318.
 * @author Sean A. Irvine
 */
public class A049324 extends MemoryFunction2Sequence<Integer, Z> {

  protected int mN = 0;
  protected int mM = 0;

  protected long multiplier() {
    return 3;
  }

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n < m || m == 0) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(multiplier()).multiply(multiplier() * m - n + 1).add(get(n - 1, m - 1).multiply(m)).divide(n);
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
