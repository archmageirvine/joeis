package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083798 Triangle obtained by replacing each term in A083796 with the sum of all other terms in that row.
 * @author Sean A. Irvine
 */
public class A083801 extends A083796 {

  private int mN = -1;
  private int mM = 0;
  private Z mSum = null;
  private Z[] mRow = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mSum = Z.ZERO;
      mRow = new Z[mN + 1];
      for (int k = 0; k < mRow.length; ++k) {
        mRow[k] = super.next();
        mSum = mSum.add(mRow[k]);
      }
    }
    return mSum.subtract(mRow[mM]).divide(mM + 1);
  }
}
