package irvine.oeis.a007;

import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007178 Number of ways to write 1 as ordered sum of n powers of 1/2, allowing repeats.
 * @author Sean A. Irvine
 */
public class A007178 extends MemoryFunctionInt3<Z> implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  protected Z compute(final int n, final int r, final int p) {
    if (n < r) {
      return Z.ZERO;
    }
    if (r == 0) {
      if (n == 0) {
        return mF.factorial(p);
      }
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= Math.min(n, r); ++j) {
      sum = sum.add(get(n - j, 2 * (r - j), p + j).divide(mF.factorial(j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 1, 0);
  }
}
