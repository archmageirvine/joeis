package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070977 Smallest k such that zeta(3)-sum(i=1,k,1/i^3) &lt;= zeta(4)-sum(i=1,n,1/i^4).
 * @author Sean A. Irvine
 */
public class A070977 extends Sequence1 {

  private static final CR ZETA_DIFF = Zeta.zeta(3).subtract(Zeta.zeta(4));
  private Q mSum3 = Q.ZERO;
  private Q mSum4 = Q.ZERO;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mSum4 = mSum4.add(new Q(1, Z.valueOf(++mN).pow(4)));
    final CR t = ZETA_DIFF.add(CR.valueOf(mSum4));
    while (CR.valueOf(mSum3).compareTo(t) < 0) {
      mSum3 = mSum3.add(new Q(1, Z.valueOf(++mM).pow(3)));
    }
    return Z.valueOf(mM);
  }
}
