package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015732 Even numbers k such that d(k) | phi(k).
 * @author Sean A. Irvine
 */
public class A015732 implements Sequence {

  private Z mN = Z.SIX;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.phi().mod(fs.sigma0()).isZero()) {
        return mN;
      }
    }
  }
}
