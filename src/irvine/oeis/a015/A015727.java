package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015727 Numbers n such that phi(n) * sigma(n) + 4 is a perfect square.
 * @author Sean A. Irvine
 */
public class A015727 implements Sequence {

  private Z mN = Z.SEVEN;

  private static boolean is(final Z m) {
    final FactorSequence fs = Jaguar.factor(m);
    final Z a = fs.sigma().multiply(fs.phi()).add(4);
    return a.sqrtAndRemainder()[1].isZero();
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}
