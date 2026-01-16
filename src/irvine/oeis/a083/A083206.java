package irvine.oeis.a083;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083203.
 * @author Sean A. Irvine
 */
public class A083206 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int k) {
      if (k <= m) {
        final Z t = get(n, m, k + 1);
        return n % k == 0 ? t.add(get(n, m - k, k + 1)) : t;
      }
      return m == 0 ? Z.ONE : Z.ZERO;
    }
  };

  @Override
  public Z next() {
    final Z sigma = Functions.SIGMA1.z(++mN);
    if (sigma.isOdd()) {
      return Z.ZERO;
    }
    return mB.get(mN, sigma.divide2().intValueExact(), 2);
  }
}
