package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015728 Numbers n such that phi(n) * sigma(n) + 9 is a perfect square.
 * @author Sean A. Irvine
 */
public class A015728 extends Sequence1 {

  private Z mN = Z.NINE;

  private static boolean is(final Z m) {
    final FactorSequence fs = Jaguar.factor(m);
    final Z a = fs.sigma().multiply(fs.phi()).add(9);
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
