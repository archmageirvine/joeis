package irvine.oeis.a208;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A208767 Generalized 2-super abundant numbers.
 * @author Sean A. Irvine
 */
public class A208767 implements Sequence {

  private Q mBest = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Q t = new Q(Cheetah.factor(n).sigma(2), n.square());
      if (t.compareTo(mBest) > 0) {
        mBest = t;
        return n;
      }
    }
  }
}
