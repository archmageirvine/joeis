package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067086 a(n) = floor(Sum_{k=1..n} 1/k^(1/3)).
 * @author Sean A. Irvine
 */
public class A067086 extends Sequence1 {

  private long mN = 0;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(CR.valueOf(++mN).pow(Q.ONE_THIRD).inverse());
    return mSum.floor();
  }
}
