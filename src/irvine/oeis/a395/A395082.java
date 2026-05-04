package irvine.oeis.a395;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395082 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A395082 extends Sequence0 {

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
      return get(n - 1, m, r).add(get(n - 1, m - n, r - Functions.PHI.i(n)));
    }
  };

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return mB.get(mN, mN, Functions.PHI.i(mN));
  }
}
