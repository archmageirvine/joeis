package irvine.oeis.a074;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074759 Number of degree-n permutations of order dividing n. Number of solutions to x^n = 1 in S_n.
 * @author Sean A. Irvine
 */
public class A074759 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sumdiv(m, j -> Integers.SINGLETON.product(1, j - 1, i -> Z.valueOf(n - i)).multiply(get(n - j, m)));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
