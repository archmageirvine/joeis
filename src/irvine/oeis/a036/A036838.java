package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036838 Triangle read by rows: T(n,k) = value of Schoenheim bound L_1(n+2,k+2,k+1) on covering numbers (0 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A036838 extends A036831 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return l(mN + 2, mM + 2, mM + 1, 1);
  }
}
