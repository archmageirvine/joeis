package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077117 Least k such that Z(k,6) &lt;= Z(n,7) where Z(m,s) = Sum_{i&gt;=m} 1/i^s.
 * @author Sean A. Irvine
 */
public class A077117 extends Sequence0 {

  private static final CR ZETA6 = Zeta.zeta(6);
  private static final CR ZETA7 = Zeta.zeta(7);
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    CR v = ZETA7;
    for (long j = 1; j < mN; ++j) {
      v = v.subtract(CR.valueOf(new Q(Z.ONE, Z.valueOf(j).pow(7))));
    }
    CR u = ZETA6;
    long k = 0;
    while (u.compareTo(v) > 0) {
      u = u.subtract(CR.valueOf(new Q(Z.ONE, Z.valueOf(++k).pow(6))));
    }
    return Z.valueOf(k + 1);  // the OEIS values seem to be off by 1?
  }
}

