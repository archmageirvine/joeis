package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065370 The next smallest pair of numbers is taken so that a(2n-1)/a(2n) converges to e = exp(1).
 * @author Sean A. Irvine
 */
public class A065370 extends Sequence1 {

  private static final int COMPARE_ACCURACY = -1000;
  private static final CR E1 = CR.E.add(CR.ONE);
  private Z mN = Z.ONE;
  private Z mB = null;
  private CR mAbsDelta = CR.E;

  @Override
  public Z next() {
    if (mB != null) {
      final Z t = mB;
      mB = null;
      return t;
    }
    while (true) {
      mN = mN.add(1);
      final Z a = CR.E.multiply(mN).divide(E1).round();
      final Q t = new Q(a, mN.subtract(a));
      final CR delta = CR.E.subtract(CR.valueOf(t)).abs();
      if (delta.compareTo(mAbsDelta, COMPARE_ACCURACY) < 0) {
        mAbsDelta = delta;
        mB = mN.subtract(a);
        return a;
      }
    }
  }
}
