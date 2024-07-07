package irvine.oeis.a071;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071147.
 * @author Sean A. Irvine
 */
public class A071223 extends Sequence2 {

  private int mN = 1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m >= n) {
        return Z.ZERO;
      }
      if (m == 1) {
        return Z.TWO;
      }
      if (m == n - 1) {
        return Functions.FACTORIAL.z(n);
      }
      return get(n - 1, m).add(get(n - 1, m - 1).multiply(n - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
