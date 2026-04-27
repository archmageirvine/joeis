package irvine.oeis.a395;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395111 a(n) is the number of partitions of n into distinct parts such that the sum of rad(k) over the parts k equals rad(n).
 * @author Sean A. Irvine
 */
public class A395111 extends Sequence0 {

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
      return get(n - 1, m, r).add(get(n - 1, m - n, r - Functions.RAD.i(n)));
    }
  };

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return mB.get(mN, mN, Functions.RAD.i(mN));
  }
}
