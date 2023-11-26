package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066930 Numbers n such that phi(sigma(n)) divides sigma(phi(n)).
 * @author Sean A. Irvine
 */
public class A066930 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.phi()).sigma().mod(Euler.phi(fs.sigma())).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
