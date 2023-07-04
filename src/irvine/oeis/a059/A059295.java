package irvine.oeis.a059;

import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.math.z.Z;

/**
 * A059295 2-boustrophedon transform (see A059294) of 1, 1, 1, 1, ...
 * @author Sean A. Irvine
 */
public class A059295 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;

  @Override
  protected Z compute(final int i, final int j) {
    if (j == 0) {
      return Z.ONE;
    }
    if (i == j) {
      return get(i, i - 1).add(get(i - 1, 0));
    }
    return get(i, j - 1).add(get(i - 1, i - j)).add(get(i - 1, i - j - 1));
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
