package irvine.oeis.a005;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005328.
 * @author Sean A. Irvine
 */
public class A005328 extends MemoryFunction1<Z> implements Sequence {

  private int mN = 1;

  @Override
  protected Z compute(final int n) {
    Z prod = Z.ONE;
    for (int i = 1; i <= n; ++i) {
      prod = prod.multiply(Z.ONE.shiftLeft(i).subtract(1));
    }
    return prod;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Z p = get(mN - 1);
    for (int k = 0; k <= mN - 2; ++k) {
      sum = sum.signedAdd((k & 1) == 0, p.multiply(mN - 1 - k).divide(get(k)));
    }
    return sum;
  }

}
