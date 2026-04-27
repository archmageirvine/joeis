package irvine.oeis.a395;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395096 a(n) is the number of partitions of n into distinct parts such that the sum of A001221 over the parts equals A001221(n).
 * @author Sean A. Irvine
 */
public class A395096 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int r) {
      if (n == 0) {
        return m == 0 && r == 0 ? Z.ONE : Z.ZERO;
      }
      if (m < 0 || r < 0) {
        return Z.ZERO;
      }
      return get(n - 1, m, r).add(get(n - 1, m - n, r - Functions.OMEGA.i(n)));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN, Functions.OMEGA.i(mN));
  }
}
