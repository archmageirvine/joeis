package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067052 Floor((sum_{1..n} 1/i)^n).
 * @author Sean A. Irvine
 */
public class A067052 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(1, ++mN));
    return mSum.pow(mN).floor();
  }
}

