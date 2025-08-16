package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018894 Numbers k such that sigma(k)/phi(k) sets a new record.
 * @author Sean A. Irvine
 */
public class A018894 extends Sequence1 {

  private Q mBest = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Q r = new Q(fs.sigma(), fs.phi());
      if (r.compareTo(mBest) > 0) {
        mBest = r;
        return Z.valueOf(mN);
      }
    }
  }
}

