package irvine.oeis.a392;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392154 Left diagonal of the difference table of n! under the operator Delta + 2*Delta^2.
 * @author Sean A. Irvine
 */
public class A392154 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Functions.FACTORIAL.z(m);
      }
      return get(n - 1, m + 2).multiply2().subtract(get(n - 1, m + 1).multiply(3)).add(get(n - 1, m));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}
