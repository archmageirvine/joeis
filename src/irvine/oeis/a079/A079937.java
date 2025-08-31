package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079937 Greedy frac multiples of Pi^2/6: a(1)=1, Sum_{n&gt;=1} frac(a(n)*x) = 1 at x = Pi^2/6.
 * @author Sean A. Irvine
 */
public class A079937 extends Sequence1 {

  private final CR mX = CR.PI.square().divide(6);
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
