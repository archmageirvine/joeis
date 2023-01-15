package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061015 Numerator of Sum_{i=1..n} 1/p(i)^2, p(i) = i-th prime.
 * @author Sean A. Irvine
 */
public class A061015 extends A000040 {

  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next().square()));
    return mSum.num();
  }
}

