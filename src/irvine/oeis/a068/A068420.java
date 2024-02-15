package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068420 Numbers n such that sigma(n) = 4*(n-phi(n)).
 * @author Sean A. Irvine
 */
public class A068420 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().equals(mN.subtract(fs.phi()).multiply(4))) {
        return mN;
      }
    }
  }
}

