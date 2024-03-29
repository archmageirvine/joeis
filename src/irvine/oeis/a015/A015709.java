package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015709 Composite n such that phi(n) * sigma(n) is one less than a square.
 * @author Sean A. Irvine
 */
public class A015709 extends Sequence1 {

  private Z mN = Z.FIVE;

  static boolean is(final Z m) {
    final FactorSequence fs = Jaguar.factor(m);
    final Z a = fs.sigma().multiply(fs.phi()).add(1);
    return a.sqrtAndRemainder()[1].isZero();
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isProbablePrime() && is(mN)) {
        return mN;
      }
    }
  }
}
