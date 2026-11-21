package irvine.oeis.a123;

import irvine.math.polynomial.BarSymmetricGroupCycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A123548 Triangle read by rows: T(n,k) = number of unlabeled bicolored graphs having 2n nodes and k edges, which are invariant when the two color classes are interchanged. Here n &gt;= 0, 0 &lt;= k &lt;= n^2.
 * @author Gregory Morse
 */
public class A123548 extends Sequence0 {
  private int mN = -1;
  private int mK = 0;
  private Polynomial<Q> mRow;

  protected Polynomial<Q> row(final int n) {
    return BarSymmetricGroupCycleIndex.barSymmetricGroupCycleIndex(n).applyOnePlusXToTheN();
  }

  @Override
  public Z next() {
    if (++mK > mN * mN || mN < 0) {
      mK = 0;
      if (++mN == 0) {
        return Z.ONE;
      }
      mRow = row(mN);
    }
    return mRow.coeff(mK).toZ();
  }
}
