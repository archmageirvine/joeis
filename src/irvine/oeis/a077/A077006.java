package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077006 Numbers k such that sigma(k)/k &gt;= sigma(m)/m for all m &lt;= k.
 * @author Sean A. Irvine
 */
public class A077006 extends Sequence1 {

  private long mN = 0;
  private Q mBest = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Q t = new Q(Functions.SIGMA1.z(++mN), mN);
      if (t.compareTo(mBest) >= 0) {
        mBest = t;
        return Z.valueOf(mN);
      }
    }
  }
}

