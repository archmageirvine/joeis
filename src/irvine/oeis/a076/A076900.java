package irvine.oeis.a076;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076900 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (m < 1) {
        return Z.ZERO;
      }
      final Z t = get(n, m - 1);
      return m > n ? t : t.add(get(n - m, m).multiply(Binomial.binomial(n, m)).multiply(m));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
