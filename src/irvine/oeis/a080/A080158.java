package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006752;

/**
 * A080158 Greedy frac multiples of Catalan's constant, G: a(1)=1, Sum_{n&gt;0} frac(a(n)*x) = 1 at x=G=A006752, where "frac(y)" denotes the fractional part of y.
 * @author Sean A. Irvine
 */
public class A080158 extends Sequence1 {

  private final CR mX = new A006752().getCR();
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
