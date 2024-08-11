package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015734 Odd numbers k such that d(k) does not divide phi(k).
 * @author Sean A. Irvine
 */
public class A015734 extends Sequence1 {

  private Z mN = Z.valueOf(23);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final FactorSequence fs = Jaguar.factor(mN);
      if (!fs.phi().mod(fs.sigma0()).isZero()) {
        return mN;
      }
    }
  }
}
