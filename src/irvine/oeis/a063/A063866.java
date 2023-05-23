package irvine.oeis.a063;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063866 Number of solutions to +- 1 +- 2 +- 3 +- ... +- n = 1.
 * @author Sean A. Irvine
 */
public class A063866 extends Sequence0 {

  private int mN = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int s) {
      if (n == 0) {
        return s == 0 ? Z.ONE : Z.ZERO;
      }
      if (Math.abs(s) > n * (n + 1) / 2) {
        return Z.ZERO;
      }
      return get(n - 1, s - n).add(get(n - 1, s + n));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 1);
  }
}
