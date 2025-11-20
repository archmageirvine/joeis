package irvine.oeis.a390;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A390491 allocated for Julian Allagan.
 * @author Sean A. Irvine
 */
public class A390491 extends Sequence2 {

  private int mN = 0;
  private int mM = -1;

  private final MemoryFunctionInt2<Z> mF = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int k, final int r) {
      if (k == 0) {
        return Z.ZERO;
      }
      if (k == 1) {
        return Z.ONE;
      }
      return get(k - 1, r).add(get(k - 2, r).multiply(r));
    }
  };

  private Z t(final int m, final int r) {
    return mF.get(m, r).add(mF.get(m - 1, r).multiply2()).add(mF.get(m - 2, r));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 2, mN - mM + 1);
  }
}
