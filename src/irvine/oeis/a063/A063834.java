package irvine.oeis.a063;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063834 Twice partitioned numbers: the number of ways a number can be partitioned into not necessarily different parts and each part is again so partitioned.
 * @author Sean A. Irvine
 */
public class A063834 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0 || i == 1) {
        return Z.ONE;
      }
      return get(n, i - 1).add(i > n ? Z.ZERO : get(n - i, i).multiply(Functions.PARTITIONS.z(i)));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
