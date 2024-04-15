package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067573 Numbers such that Sigma(Phi(k))/Sigma(k) &gt; Sigma(Phi(j))/Sigma(j) for all k &gt; j.
 * @author Sean A. Irvine
 */
public class A067573 extends Sequence1 {

  private long mN = 1;
  private Q mRecord = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Q a = new Q(Functions.SIGMA.z(Euler.phi(++mN)), Functions.SIGMA.z(mN));
      if (a.compareTo(mRecord) > 0) {
        mRecord = a;
        return Z.valueOf(mN);
      }
    }
  }
}
