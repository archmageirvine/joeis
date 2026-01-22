package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068421 Numbers k such that sigma(k) = 6*(k - phi(k)).
 * @author Sean A. Irvine
 */
public class A068421 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().equals(mN.subtract(fs.phi()).multiply(6))) {
        return mN;
      }
    }
  }
}

