package irvine.oeis.a080;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080418 Generalized Pascal triangle.
 * @author Sean A. Irvine
 */
public class A080418 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.ONE;
      }
      if (m > n) {
        return Z.ZERO;
      }
      if (m == 2) {
        return get(n - 1, 1).add(get(n - 1, 2)).add(Z.NEG_ONE.pow(n).multiply2());
      }
      return get(n - 1, m - 1).add(get(n - 1, m)).add(Z.NEG_ONE.pow(n + m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}

