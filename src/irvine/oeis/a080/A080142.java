package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080142 Greedy frac multiples of 1/Pi: a(1)=1, Sum_{n&gt;0} frac(a(n)*x) = 1 at x=1/Pi, where "frac(y)" denotes the fractional part of y.
 * @author Sean A. Irvine
 */
public class A080142 extends Sequence1 {

  private final CR mX = CR.PI.inverse();
  private long mN = 0;
  private CR mSum = CR.ZERO;


  @Override
  public Z next() {
    while (true) {
      final CR t = mSum.add(mX.multiply(++mN).frac());
      if (t.compareTo(CR.ONE) <= 0) {
        mSum = t;
        return Z.valueOf(mN);
      }
    }
  }
}
