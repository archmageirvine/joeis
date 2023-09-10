package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065674 Positions of the elements of the quasicyclic group Z+(2a+1)/(2^b) [a &gt; 0 and a &lt; 2^(b-1), b &gt; 0] at the ]0,1[ side of the Stern-Brocot Tree (A007305/A007306).
 * @author Sean A. Irvine
 */
public class A065674 extends A065658 {

  private long mN = 0;

  private Z quasiCyclics2PosIn01SternBrocotTree(final long t) {
    final Z den = Z.ONE.shiftLeft(LongUtils.lg(t) + 1);
    final Q num = new Q(Z.valueOf(2 * t).subtract(den).add(1));
    return frac2PositionIn01SBTree(num.divide(den));
  }

  @Override
  public Z next() {
    return quasiCyclics2PosIn01SternBrocotTree(++mN);
  }
}
