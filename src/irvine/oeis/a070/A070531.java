package irvine.oeis.a070;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070531 Generalized Bell numbers B_{4,3}.
 * @author Sean A. Irvine
 */
public class A070531 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 1 && m == 3) {
        return Z.ONE;
      }
      if (n < 2) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(0, 3, p -> Binomial.binomial(3, p).multiply(Functions.FALLING_FACTORIAL.z(n - 1 - p + m, 3 - p)).multiply(mB.get(n - 1, m - p)));
    }
  };

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(3, 3 * ++mN, k -> mB.get(mN, k));
  }
}
