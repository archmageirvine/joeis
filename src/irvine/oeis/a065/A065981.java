package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065981 Best approximation of the remainder in the zeta(4) series using the remainder in the zeta(3) series.
 * @author Sean A. Irvine
 */
public class A065981 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private final CR mZeta3 = Zeta.zeta(3);
  private final CR mZeta4 = Zeta.zeta(4);
  private Q mSum3 = Q.ZERO;
  private Q mSum4 = Q.ZERO;

  @Override
  public Z next() {
    ++mN;
    mSum4 = mSum4.add(new Q(Z.ONE, Z.valueOf(mN).pow(4)));
    final CR z4 = mZeta4.subtract(CR.valueOf(mSum4));
    while (true) {
      final CR z3 = mZeta3.subtract(CR.valueOf(mSum3));
      if (z3.compareTo(z4) < 0) {
        return Z.valueOf(mM - 1);
      }
      mSum3 = mSum3.add(new Q(Z.ONE, Z.valueOf(++mM).pow(3)));
    }
  }
}
