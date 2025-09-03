package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079939 Greedy frac multiples of e: a(1)=1, Sum_{n&gt;0} frac(a(n)*e)=1.
 * @author Sean A. Irvine
 */
public class A079939 extends Sequence1 {

  private final CR mX = CR.E;
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
