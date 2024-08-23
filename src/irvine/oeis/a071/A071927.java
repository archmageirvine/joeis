package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a005.A005101;

/**
 * A071927 Barely abundant numbers: abundant n such that sigma(n)/n &lt; sigma(m)/m for all abundant numbers m&lt;n, sigma(n) being the sum of the divisors of n.
 * @author Sean A. Irvine
 */
public class A071927 extends A005101 {

  private Q mBest = Q.TEN;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Q v = new Q(Functions.SIGMA.z(t), t);
      if (v.compareTo(mBest) < 0) {
        mBest = v;
        return t;
      }
    }
  }
}
