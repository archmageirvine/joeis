package irvine.oeis.a051;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051685 Auxiliary sequence for calculation of number of even permutations of degree n and order exactly 4.
 * @author Sean A. Irvine
 */
public class A051685 extends MemoryFunction2<Integer, Z> implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0 && m == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      Z s = Z.ZERO;
      for (int l = 1; l <= m; ++l) {
        if (IntegerUtils.lcm(l, k) == m) {
          s = s.add(get(n - k, l));
        }
      }
      sum = sum.signedAdd((k & 1) == 1, s.multiply(mF.factorial(n - 1).divide(mF.factorial(n - k))));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 4);
  }
}
