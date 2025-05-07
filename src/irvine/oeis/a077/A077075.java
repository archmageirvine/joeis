package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077075 Least k such that Z(k,4) &lt;= Z(n,5) where Z(m,s) = Sum_{i&gt;=m} 1/i^s.
 * @author Sean A. Irvine
 */
public class A077075 extends Sequence0 {

  private static final CR ZETA4 = Zeta.zeta(4);
  private static final CR ZETA5 = Zeta.zeta(5);
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    CR v = ZETA5;
    for (long j = 1; j < mN; ++j) {
      v = v.subtract(CR.valueOf(new Q(Z.ONE, Z.valueOf(j).pow(5))));
    }
    CR u = ZETA4;
    long k = 0;
    while (u.compareTo(v) > 0) {
      u = u.subtract(CR.valueOf(new Q(Z.ONE, Z.valueOf(++k).pow(4))));
    }
    return Z.valueOf(k + 1);  // the OEIS values seem to be off by 1?
  }
}

