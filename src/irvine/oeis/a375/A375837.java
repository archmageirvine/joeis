package irvine.oeis.a375;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A375837 allocated for Rajesh Kumar Mohapatra.
 * @author Sean A. Irvine
 */
public class A375837 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k < 0 || k > n) {
        return Z.ZERO;
      }
      if (k == 0) {
        return n == 0 ? Z.ONE : Z.ZERO;
      }
      if (k == 1) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(k - 1, n - 1, v -> get(v, k - 1).multiply(Functions.STIRLING1.z(n, v).abs()));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
