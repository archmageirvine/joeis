package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015705 Geometric mean of phi(n) and sigma(n) is an integer, n odd.
 * @author Sean A. Irvine
 */
public class A015705 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long m) {
    final FactorSequence fs = Jaguar.factor(m);
    final Z a = fs.sigma().multiply(fs.phi());
    return a.sqrtAndRemainder()[1].isZero();
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
