package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A034781 Triangle of number of rooted trees with n &gt;= 2 nodes and height h &gt;= 1.
 * @author Sean A. Irvine
 */
public class A034781 extends MemoryFunctionInt3Sequence<Z> {

  // After Alois P. Heinz

  @Override
  protected Z compute(final int n, final int i, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (i < 1 || k < 1) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (int j = 0; j <= n / i; ++j) {
      s = s.add(Binomial.binomial(get(i - 1, i - 1, k - 1).add(j - 1), Z.valueOf(j)).multiply(get(n - i * j, i - 1, k)));
    }
    return s;
  }

  protected Z t(final int n, final int d) {
    return get(n - 1, n - 1, d).subtract(get(n - 1, n - 1, d - 1));
  }

  private int mN = 1;
  private int mD = 0;

  @Override
  public Z next() {
    if (++mD >= mN) {
      ++mN;
      mD = 1;
    }
    return t(mN, mD);
  }

}
