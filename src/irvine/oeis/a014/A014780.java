package irvine.oeis.a014;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014780 Triangle of numbers associated with Genocchi numbers.
 * @author Sean A. Irvine
 */
public class A014780 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n == 1) {
      return Z.ONE;
    }
    Z sum;
    if (k == 2) {
      sum = Z.ZERO;
      for (int j = 2; j <= 2 * n - 2; ++j) {
        sum = sum.add(get(n - 1, j));
      }
    } else {
      sum = get(n, k - 1);
      if ((k & 1) == 0) {
        for (int j = k - 1; j <= 2 * n - 2; ++j) {
          sum = sum.add(get(n - 1, j));
        }
      } else {
        for (int j = 2; j < k - 1; ++j) {
          sum = sum.subtract(get(n - 1, j));
        }
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 2;
    }
    return get(mN, mM);
  }
}
