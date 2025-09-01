package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079941 Greedy frac multiples of log(2): a(1)=1, sum(n&gt;0,frac(a(n)*x))=1 at x=log(2).
 * @author Sean A. Irvine
 */
public class A079941 extends Sequence1 {

  private final CR mX = CR.LOG2;
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
