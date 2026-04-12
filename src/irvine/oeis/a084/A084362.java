package irvine.oeis.a084;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084362 a(n) = Sum_{lambda_1 + lambda_2 + ... = n} Sum_{k=1..lambda_1} k * C(lambda_1-1, k-1), where lambda_1 is the largest part of the partition of n.
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
