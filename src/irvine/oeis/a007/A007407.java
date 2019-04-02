package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007407 a(n) = denominator of Sum_{k=1..n} 1/k^2.
 * @author Sean A. Irvine
 */
public class A007407 implements Sequence {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(++mN).square()));
    return mSum.den();
  }
}

