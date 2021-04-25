package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.a173.A173018;

/**
 * A123125 Triangle of Eulerian numbers T(n,k), 0 &lt;= k &lt;= n, read by rows.
 * @author Sean A. Irvine
 */
public class A123125 extends A173018 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final Integer n, final Integer m) {
    return get(n, n - m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
