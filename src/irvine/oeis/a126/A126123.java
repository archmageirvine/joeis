package irvine.oeis.a126;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a339.A339064;

/**
 * A126123 Triangle read by rows: T(n,k) = number of edge-rooted unlabeled graphs having n nodes and k edges, n &gt; 0, 0 &lt; k &lt;= n*(n-1)/2.
 * @author Gregory Morse
 */
public class A126123 extends A339064 {
  {
    setOffset(1);
  }

  private int mN = 0;
  private int mM = 1;
  private Polynomial<Z> mRow;

  @Override
  public Z next() {
    if (++mM > Math.max(1, mN * (mN - 1) / 2)) {
      ++mN;
      mM = 1;
      final int max = mN * (mN - 1) / 2;
      mRow = mN == 1 ? RING.zero() : RING.series(rootedCounts(mN - 2, max).shift(1), RING.onePlusXToTheN(1), max);
    }
    return mRow.coeff(mM);
  }
}
