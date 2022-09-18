package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059294 2-boustrophedon transform applied to 1, 0, 0, 0, ...
 * @author Sean A. Irvine
 */
public class A059294 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;

  @Override
  protected Z compute(final int i, final int j) {
    if (j == 0) {
      return i == 0 ? Z.ONE : Z.ZERO;
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
