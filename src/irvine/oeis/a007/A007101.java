package irvine.oeis.a007;

import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.z.Z;

/**
 * A007101 Number of labeled trivalent (or cubic) cyclically 4-connected graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A007101 extends MemoryFunction1Sequence<Z> {

  private int mN = 1;
  private Z mF = Z.TWO;

  @Override
  protected Z compute(final int n) {
    if (n < 2) {
      return Z.ZERO;
    }
    if (n == 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int i = 1; i < n - 1; ++i) {
      sum = sum.add(get(n - i).multiply(get(i + 1).multiply(2L * i + 1).add(get(i).multiply(i + 1))));
    }
    return sum.multiply2().subtract(get(n - 1).multiply(n + 2));
  }

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(2L * mN).multiply(2L * mN - 1);
    return get(mN).multiply(mF).shiftRight(mN).divide(3L * mN);
  }
}
