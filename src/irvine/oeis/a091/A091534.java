package irvine.oeis.a091;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A091534.
 * @author Sean A. Irvine
 */
public class A091534 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 1 && k == 2) {
        return Z.ONE;
      }
      if (n >= 2 && k >= 2 && k <= 2 * n) {
        return Integers.SINGLETON.sum(0, 2, p -> Binomial.binomial(2, p).multiply(Functions.FALLING_FACTORIAL.z(3L * (n - 1) + k - p, 2 - p)).multiply(get(n - 1, k - p)));
      }
      return Z.ZERO;
    }
  };

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 2;
    }
    return mB.get(mN, mM);
  }
}
