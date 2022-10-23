package irvine.oeis.a208;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A208767 Generalized 2-super abundant numbers.
 * @author Sean A. Irvine
 */
public class A208767 extends Sequence1 {

  private Q mBest = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Q t = new Q(Jaguar.factor(n).sigma(2), n.square());
      if (t.compareTo(mBest) > 0) {
        mBest = t;
        return n;
      }
    }
  }
}
