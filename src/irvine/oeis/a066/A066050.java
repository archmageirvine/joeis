package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066050 Average of divisors of n (sigma(n)/d(n)) is greater than average of divisors for all k &lt; n.
 * @author Sean A. Irvine
 */
public class A066050 extends Sequence1 {

  private Q mBest = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Q t = new Q(fs.sigma(), fs.sigma0());
      if (t.compareTo(mBest) > 0) {
        mBest = t;
        return Z.valueOf(mN);
      }
    }
  }
}
