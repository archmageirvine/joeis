package irvine.oeis.a076;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076615 Number of permutations of {1,2,...,n} that result in a binary search tree with the minimum possible height.
 * @author Sean A. Irvine
 */
public class A076615 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n == 1) {
        return k > 0 ? Z.ONE : Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, n, r -> Binomial.binomial(n - 1, r - 1).multiply(mB.get(r - 1, k - 1)).multiply(mB.get(n - r, k - 1)));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, Functions.DIGIT_LENGTH.i(2, mN));
  }
}
