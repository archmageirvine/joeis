package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.a034.A034851;

/**
 * A102541 Triangle read by rows, formed from antidiagonals of Losanitsch's triangle. T(n,k ) = A034851(n-k, k), n &gt;= 0 and 0 &lt;= k &lt;= floor(n/2).
 * @author Sean A. Irvine
 */
public class A102541 extends A034851 {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z t(final long n, final long k) {
    return super.t(n - k, k);
  }

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
