package irvine.oeis.a348;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A348590 Number of endofunctions on [n] with exactly one isolated fixed point.
 * @author Sean A. Irvine
 */
public class A348590 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunction1<Z> mG = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return Integers.SINGLETON.sum(1, n, k -> Z.valueOf(n).pow(n - k).multiply(Functions.FACTORIAL.z(n - 1).divide(Functions.FACTORIAL.z(n - k))));
    }
  };
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int t) {
      if (n == 0) {
        return Z.valueOf(t);
      }
      return Integers.SINGLETON.sum(1 + t, n, i -> mG.get(i).multiply(get(n - i, i == 1 ? 1 : t).multiply(Binomial.binomial(n - 1, i - 1))));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}
