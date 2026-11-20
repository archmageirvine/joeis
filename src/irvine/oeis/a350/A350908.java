package irvine.oeis.a350;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a052.A052283;

/**
 * A350908 Triangle read by rows: T(n,k) is the number of digraphs on n unlabeled unisolated nodes with k arcs, k = 0..n*(n-1).
 * @author Gregory Morse
 */
public class A350908 extends A052283 {
  {
    setOffset(1);
  }

  private int mN = 0;
  private int mArc = 0;
  private Polynomial<Z> mPrevious = RING.one();
  private Polynomial<Z> mRow = RING.zero();

  @Override
  public Z next() {
    if (++mArc > (long) mN * (mN - 1)) {
      final Polynomial<Z> all = g(++mN);
      // Deleting one isolate leaves the arc count unchanged.
      mRow = RING.subtract(all, mPrevious);
      mPrevious = all;
      mArc = 0;
    }
    return mRow.coeff(mArc);
  }
}
