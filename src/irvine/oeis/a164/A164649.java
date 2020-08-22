package irvine.oeis.a164;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A164649 Numbers n such that sigma(n)/phi(n) = 36/25.
 * @author Sean A. Irvine
 */
public class A164649 implements Sequence {

  private static final Z TWENTY_FIVE = Z.valueOf(25);
  private static final Z THIRTY_SIX = Z.valueOf(36);
  private long mN = 5796;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z phi = fs.phi();
      if (phi.mod(25) == 0) {
        final Q q = new Q(fs.sigma(), phi);
        if (q.num().equals(THIRTY_SIX) && q.den().equals(TWENTY_FIVE)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

