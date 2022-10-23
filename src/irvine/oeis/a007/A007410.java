package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007410 Numerator of Sum_{k=1..4} k^(-4).
 * @author Sean A. Irvine
 */
public class A007410 extends Sequence1 {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(++mN).pow(4)));
    return mSum.num();
  }
}

