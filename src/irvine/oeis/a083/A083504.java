package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083504 Triangle read by rows: for 1 &lt;= k &lt;= n, T(n, k) is the total perimeter of all squares contained in a square grid with n rows and k columns.
 * @author Sean A. Irvine
 */
public class A083504 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(-mM).add(2L * mN - 2).multiply(mM).add(6L * mN + 1).multiply(mM).add(4L * mN + 2).multiply(mM).divide(3);
  }
}
