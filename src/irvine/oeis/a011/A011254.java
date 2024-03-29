package irvine.oeis.a011;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011254 Numbers k such that phi(k) + sigma(k) = 4*k.
 * @author Sean A. Irvine
 */
public class A011254 extends Sequence1 {

  private Z mN = Z.valueOf(23758);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.phi().add(fs.sigma()).equals(mN.multiply(4))) {
        return mN;
      }
    }
  }
}

