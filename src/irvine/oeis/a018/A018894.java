package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018894.
 * @author Sean A. Irvine
 */
public class A018894 implements Sequence {

  private Q mBest = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Q r = new Q(fs.sigma(), fs.phi());
      if (r.compareTo(mBest) > 0) {
        mBest = r;
        return Z.valueOf(mN);
      }
    }
  }
}

