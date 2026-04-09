package irvine.oeis.a084;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084362 a(n) = Sum{j_1 + ... + j_n = n} Sum_{k=1..n} k*C(n-1,k-1), where the outer sum is over all partitions of n.
 * @author Sean A. Irvine
 */
public class A084362 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0 || i == 1) {
        return Z.ONE;
      }
      return get(n, i - 1).add(get(n - i, Math.min(n - i, i)));
    }
  };

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int j = 1; j <= mN; ++j) {
      sum = sum.add(mB.get(mN - j, Math.min(j, mN - j)).multiply(Z.valueOf(j + 1).shiftLeft(j - 2)));
    }
    return sum;
  }
}
