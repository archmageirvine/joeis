package irvine.oeis.a006;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006801.
 * @author Sean A. Irvine
 */
public class A006801 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After David Bevan

  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n < 1 || k < 1 || k * (k + 1) / 2 > n) {
      return Z.ZERO;
    }
    if (n == 1 && k == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = k - 1; j <= n - k; ++j) {
      sum = sum.add(get(n - k, j).multiply(j - k + 2));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
