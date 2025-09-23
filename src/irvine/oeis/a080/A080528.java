package irvine.oeis.a080;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080528 Sum of multinomials of (-1 + number of runs) in the partitions of n.
 * @author Sean A. Irvine
 */
public class A080528 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int p) {
      if (n == 0) {
        return Functions.FACTORIAL.z(p);
      }
      if (i < 1) {
        return Z.ZERO;
      }
      return get(n, i - 1, p).add(Integers.SINGLETON.sum(1, n / i, j -> get(n - i * j, i - 1, p + j - 1).divide(Functions.FACTORIAL.z(j - 1))));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN, 0);
  }
}

