package irvine.oeis.a007;

import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.z.Z;

/**
 * A007099 Number of labeled trivalent (or cubic) 2-connected graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A007099 extends MemoryFunction1Sequence<Z> {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  protected Z compute(final int n) {
    if (n <= 1) {
      return Z.ZERO;
    }
    if (n == 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int i = 2; i < n - 2; ++i) {
      sum = sum.add(get(i).multiply(get(n - 1 - i)));
    }
    return sum.multiply(3L * n - 1).add(get(n - 2).multiply2()).add(get(n - 1).multiply(3L * n));
  }

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(2L * mN).multiply(2L * mN - 1);
    return get(mN).subtract(get(mN - 1).multiply2()).multiply(mF).shiftRight(mN).divide(3L * mN);
  }
}
