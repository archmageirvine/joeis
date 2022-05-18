package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015800 Numbers k such that phi(k) + 9 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015800 implements Sequence {

  private long mN = 25;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(9)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
