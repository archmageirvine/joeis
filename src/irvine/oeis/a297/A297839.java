package irvine.oeis.a297;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A297839 Numbers k &gt; 0 that set a new record for the closeness of (4/3)*Pi*k^3 to an integer.
 * @author Sean A. Irvine
 */
public class A297839 extends Sequence1 {

  private final CR C = CR.PI.multiply(new Q(4, 3));
  private long mN = 0;
  private CR mBest = CR.ONE;

  @Override
  public Z next() {
    while (true) {
      final CR a = C.multiply(Z.valueOf(++mN).pow(3));
      final CR d = a.subtract(CR.valueOf(a.round())).abs();
      if (d.compareTo(mBest) < 0) {
        mBest = d;
        return Z.valueOf(mN);
      }
    }
  }
}
