package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067573 Numbers k &gt; 1 such that sigma(phi(k))/sigma(k) &gt; sigma(phi(j))/sigma(j) for all 1 &lt; j &lt; k.
 * @author Sean A. Irvine
 */
public class A067573 extends Sequence1 {

  private long mN = 1;
  private Q mRecord = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Q a = new Q(Functions.SIGMA.z(Functions.PHI.z(++mN)), Functions.SIGMA.z(mN));
      if (a.compareTo(mRecord) > 0) {
        mRecord = a;
        return Z.valueOf(mN);
      }
    }
  }
}
