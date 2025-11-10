package irvine.oeis.a390;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A390131 Number of proper 5-partitions of the fan graph on n vertices such that every triangle uses exactly 2 colors.
 * @author Sean A. Irvine
 */
public class A390131 extends AbstractSequence {

  private int mN = 7;

  /** Construct the sequence. */
  public A390131() {
    super(8);
  }

  private final MemoryFunctionInt2<Z> mFibPoly = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int m, final int r) {
      if (m <= 0) {
        return Z.ZERO;
      }
      if (m == 1) {
        return Z.ONE;
      }
      return get(m - 1, r).add(get(m - 2, r).multiply(r));
    }
  };

  private Z t(final int m, final int r) {
    return mFibPoly.get(m, r).add(mFibPoly.get(m - 1, r).multiply2()).add(mFibPoly.get(m - 2, r));
  }

  @Override
  public Z next() {
    ++mN;
    return t(mN - 1, 4).subtract(t(mN - 1, 3).multiply(3)).add(t(mN - 1, 2).multiply(3)).subtract(t(mN - 1, 1)).divide(6);
  }
}
