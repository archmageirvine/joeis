package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.a000.A000245;

/**
 * A244160 <code>a(0)=0,</code> and for <code>n &gt;= 1, a(n) =</code> the largest k such that k-th Catalan number <code>&lt;= n</code>.
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
