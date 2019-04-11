package irvine.oeis.a228;

import irvine.math.z.Z;
import irvine.oeis.a034.A034851;

/**
 * A228570 Triangle read by rows, formed from antidiagonals of triangle A102541. T(n, k) = A034851(n-2*k, k), <code>n&gt;= 0</code> and <code>0 &lt;=</code> k <code>&lt;= floor(n/3)</code>.
 * @author Sean A. Irvine
 */
public class A228570 extends A034851 {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z t(final long n, final long k) {
    return super.t(n - 2 * k, k);
  }

  @Override
  public Z next() {
    if (++mM > mN / 3) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
