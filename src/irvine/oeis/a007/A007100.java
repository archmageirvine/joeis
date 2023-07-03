package irvine.oeis.a007;

import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.z.Z;

/**
 * A007100 Number of labeled trivalent (or cubic) 3-connected graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A007100 extends MemoryFunction1Sequence<Z> {

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
    Z sum = get(n - 1);
    for (int i = 2; i < n - 1; ++i) {
      sum = sum.add(get(i).multiply(get(n - i)));
    }
    return sum.multiply(3L * n - 2);
  }

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(2L * mN).multiply(2L * mN - 1);
    return get(mN).multiply(mF).shiftRight(mN).divide(3L * mN);
  }
}
