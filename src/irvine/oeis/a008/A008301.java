package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008301.
 * @author Sean A. Irvine
 */
public class A008301 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Peter Luschny

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n == 1) {
      return Z.ONE;
    }
    if (k == 1) {
      return Z.ZERO;
    }
    if (k == 2) {
      Z sum = Z.ZERO;
      for (int j = 1; j <= 2 * n - 3; ++j) {
        sum = sum.add(get(n - 1, j));
      }
      return sum.multiply2();
    }
    if (k > n) {
      return get(n, 2 * n - k);
    }
    return get(n, k - 1).multiply2().subtract(get(n, k - 2)).subtract(get(n - 1, k - 2).multiply(4));
  }

  @Override
  public Z next() {
    if (++mM >= 2 * mN) {
      ++mN;
      mM = 1;
    }
    return get(mN + 1, mM + 1).shiftRight(mN);
  }
}
