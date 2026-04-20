package irvine.oeis.a395;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395022 Expansion of 1 + Sum_{k &gt;= 1} (x^(2k-1) + (k + 1) * x^(2k)) / Product_{j=1..k} (1 - j^2 * x^2).
 * @author Sean A. Irvine
 */
public class A395022 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 1 || k == n) {
        return Z.ONE;
      }
      if (k < 1 || k > n) {
        return Z.ZERO;
      }
      if ((k & 1) == 0) {
        return (n & 1) == 1 ? Z.ZERO : get(n, k - 1).multiply2().divide(k);
      }
      final Z t = get(n - 1, k).multiply(k + 1).divide2();
      return (n & 1) == 0 ? t : t.add(get(n - 1, k - 2).multiply2().divide(k - 1));
    }
  };

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(1, mN + 1, k -> mB.get(mN, k));
  }
}
