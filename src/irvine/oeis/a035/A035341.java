package irvine.oeis.a035;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A035341 Sum of ordered factorizations over all prime signatures with n factors.
 * @author Sean A. Irvine
 */
public class A035341 extends MemoryFunctionInt3Sequence<Z> {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int i, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (i < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= n / i; ++j) {
      sum = sum.add(get(n - i * j, i - 1, k).multiply(Binomial.binomial(i + k - 1, k - 1).pow(j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      for (int i = 0; i <= k; ++i) {
        sum = sum.signedAdd((i & 1) == 0, get(mN, mN, k - i).multiply(Binomial.binomial(k, i)));
      }
    }
    return sum;
  }
}

