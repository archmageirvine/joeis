package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.a000.A000245;

/**
 * A244160 a(0)=0, and for n &gt;= 1, a(n) = the largest k such that k-th Catalan number &lt;= n.
 * @author Sean A. Irvine
 */
public class A244160 extends A000245 {

  private Z mN = Z.ZERO;
  private long mM = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = super.next().longValueExact() - 1;
      mN = mN.add(1);
    }
    return mN;
  }
}
