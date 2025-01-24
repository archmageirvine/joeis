package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074452 Treated as strings, phi(n) is a substring of sigma(n).
 * @author Sean A. Irvine
 */
public class A074452 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().toString().contains(fs.phi().toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}
