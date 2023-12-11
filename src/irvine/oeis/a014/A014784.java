package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A014784 Triangle of numbers associated with Genocchi numbers.
 * @author Sean A. Irvine
 */
public class A014784 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = 1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n == 1) {
      return Z.ONE;
    }
    if (k > n || k <= 0) {
      return Z.ZERO;
    }
    if (k == 1) {
      Z sum = Z.ZERO;
      for (int j = 1; j < n; ++j) {
        sum = sum.add(get(n - 1, j));
      }
      return sum;
    }
    return get(n, k - 1).multiply2().subtract(get(n, k - 2)).subtract(get(n - 1, k - 1)).subtract(get(n - 1, k - 2));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
