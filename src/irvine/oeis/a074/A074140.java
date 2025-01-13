package irvine.oeis.a074;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074140 Sum of least integers of prime signatures over all partitions of n.
 * @author Sean A. Irvine
 */
public class A074140 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int j) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      return get(n, i - 1, j).add(i > n ? Z.ZERO : get(n - i, i, j + 1).multiply(Functions.PRIME.z(j).pow(i)));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN, 1);
  }
}
