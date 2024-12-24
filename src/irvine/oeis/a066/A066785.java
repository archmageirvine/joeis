package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066785 Numbers k such that (k, phi(k), sigma(k)) lies on a sphere with integral radius centered at the origin, i.e., k^2 + phi(k)^2 + sigma(k)^2 is a square.
 * @author Sean A. Irvine
 */
public class A066785 extends Sequence1 {

  private long mN = 602;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().square().add(fs.phi().square()).add(mN * mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

