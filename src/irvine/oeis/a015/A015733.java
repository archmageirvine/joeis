package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015733 Numbers k such that d(k) does not divide phi(k).
 * @author Sean A. Irvine
 */
public class A015733 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (!fs.phi().mod(fs.sigma0()).isZero()) {
        return mN;
      }
    }
  }
}
