package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015730 Numbers n such that tau(sigma(n))= tau(tau(n)).
 * @author Sean A. Irvine
 */
public class A015730 implements Sequence {

  private Z mN = Z.ZERO;

  private static boolean is(final Z m) {
    final FactorSequence fs = Cheetah.factor(m);
    return Cheetah.factor(fs.sigma()).sigma0().equals(Cheetah.factor(fs.sigma0AsLong()).sigma0());
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
