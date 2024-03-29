package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067037 a(n) = n^m where m = floor(Sum_{k=1..n} 1/k).
 * @author Sean A. Irvine
 */
public class A067037 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(1, ++mN));
    return Z.valueOf(mN).pow(mSum.toZ());
  }
}

