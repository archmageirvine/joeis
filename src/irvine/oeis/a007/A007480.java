package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007480 <code>a(n) =</code> denominator of sum_{k=1..n} k^(-4).
 * @author Sean A. Irvine
 */
public class A007480 implements Sequence {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(++mN).pow(4)));
    return mSum.den();
  }
}

