package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015709.
 * @author Sean A. Irvine
 */
public class A015709 implements Sequence {

  private Z mN = Z.FIVE;

  static boolean is(final Z m) {
    final FactorSequence fs = Cheetah.factor(m);
    final Z a = fs.sigma().multiply(fs.phi()).add(1);
    return a.sqrtAndRemainder()[1].equals(Z.ZERO);
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
