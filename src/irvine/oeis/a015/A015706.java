package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015706 Numbers n such that n divides <code>phi(n) * sigma(n), n</code> odd.
 * @author Sean A. Irvine
 */
public class A015706 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Cheetah.factor(mN);
      final Z a = fs.sigma().multiply(fs.phi());
      if (a.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
