package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070964.
 * @author Sean A. Irvine
 */
public class A070978 extends Sequence1 {

  private static final CR ZETA_DIFF = Zeta.zeta(4).subtract(Zeta.zeta(5));
  private Q mSum4 = Q.ZERO;
  private Q mSum5 = Q.ZERO;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mSum5 = mSum5.add(new Q(1, Z.valueOf(++mN).pow(5)));
    final CR t = ZETA_DIFF.add(CR.valueOf(mSum5));
    while (CR.valueOf(mSum4).compareTo(t) < 0) {
      mSum4 = mSum4.add(new Q(1, Z.valueOf(++mM).pow(4)));
    }
    return Z.valueOf(mM);
  }
}
