package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015705 Geometric mean of phi(n) and sigma(n) is an integer, n odd.
 * @author Sean A. Irvine
 */
public class A015705 implements Sequence {

  private long mN = -1;

  private boolean is(final long m) {
    final FactorSequence fs = Cheetah.factor(m);
    final Z a = fs.sigma().multiply(fs.phi());
    return a.sqrtAndRemainder()[1].equals(Z.ZERO);
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
