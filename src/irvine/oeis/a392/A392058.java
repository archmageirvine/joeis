package irvine.oeis.a392;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392058 allocated for Mikhail Kurkov.
 * @author Sean A. Irvine
 */
public class A392058 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      return get(n - 1, k + 1).add(Integers.SINGLETON.sum(0, k, j -> Binomial.binomial(k + 1, j).multiply(get(n - 1, j)).multiply(get(k - j, 0))));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, mN - mM);
  }
}
