package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015734 Odd n such that d(n) does not divide phi(n).
 * @author Sean A. Irvine
 */
public class A015734 implements Sequence {

  private Z mN = Z.valueOf(23);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final FactorSequence fs = Cheetah.factor(mN);
      if (!fs.phi().mod(fs.sigma0()).isZero()) {
        return mN;
      }
    }
  }
}
