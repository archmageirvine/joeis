package irvine.oeis.a049;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049463 Number of basic interval orders of length n.
 * @author Sean A. Irvine
 */
public class A049463 extends MemoryFunctionInt3<Z> implements Sequence {

  private int mN = 0;

  @Override
  protected Z compute(final int n, final int k, final int l) {
    if (n < 1 || k < 1 || l < 1) {
      return Z.ZERO;
    }
    if (k == 1 && l == 1) {
      return Z.ONE;
    }
    Z sum = get(n - 1, k - 1, l - 1).multiply(n - l)
      .add(Binomial.binomial(k, k - 1).multiply(get(n - 1, k, l)));
    for (int j = k + 1; j <= l - 1; ++j) {
      if (j != l - 2) {
        sum = sum.add(Binomial.binomial(j, k - 1).multiply(get(n - 1, j, l - 1)));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int l = 1; l < mN; ++l) {
      for (int k = 1; k <= l; ++k) {
        if (k != l - 1) {
          sum = sum.add(get(mN, k, l).multiply(Z.ONE.shiftLeft(k).add(mN - l - 1)));
        }
      }
    }
    return sum;
  }
}
